package ki;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f15623a;
    public final h3 f15624b;
    public MessageObject f15625c;
    public VideoEditedInfo d;
    public String e;
    public boolean f15626f;
    public boolean h;
    public boolean f15627n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f15623a = i10;
        this.f15624b = h3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList;
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = photoEntry.croppedMediaEntities;
            } else {
                arrayList = photoEntry.mediaEntities;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i10);
                    if (mediaEntity != null) {
                        if (mediaEntity.type == 0) {
                            byte b10 = mediaEntity.subType;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (!this.f15627n && !this.h) {
            this.h = true;
            if (this.f15625c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f15625c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f15627n) {
            return;
        }
        this.f15627n = true;
        d();
        h3 h3Var = this.f15624b;
        w3 w3Var = h3Var.f15315c;
        IdentityHashMap identityHashMap = w3Var.Y3;
        t tVar = h3Var.f15313a;
        identityHashMap.remove(tVar);
        tVar.f15509a = 3;
        w3Var.r4(h3Var.f15314b, tVar);
        w3Var.f15593f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15623a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f15624b;
        a aVar = h3Var.f15314b;
        t tVar = h3Var.f15313a;
        w3 w3Var = h3Var.f15315c;
        if (!this.h && !this.f15627n && i11 == this.f15623a && objArr.length != 0 && objArr[0] == this.f15625c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f15512f = ((Float) objArr[4]).floatValue();
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof u4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f15627n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.Y3.remove(tVar);
                    tVar.f15510b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f15515j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f15516k = i13;
                    }
                    tVar.f15517l = 0;
                    tVar.f15518m = 0;
                    tVar.f15512f = 0.0f;
                    w3Var.o4(aVar);
                    w3Var.M4(h3Var.f15314b, tVar, str, true, tVar.f15515j, tVar.f15516k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
