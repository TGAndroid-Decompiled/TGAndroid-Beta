package ki;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f15624a;
    public final h3 f15625b;
    public MessageObject f15626c;
    public VideoEditedInfo d;
    public String e;
    public boolean f15627f;
    public boolean h;
    public boolean f15628n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f15624a = i10;
        this.f15625b = h3Var;
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
        if (!this.f15628n && !this.h) {
            this.h = true;
            if (this.f15626c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f15626c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f15628n) {
            return;
        }
        this.f15628n = true;
        d();
        h3 h3Var = this.f15625b;
        w3 w3Var = h3Var.f15316c;
        IdentityHashMap identityHashMap = w3Var.Y3;
        t tVar = h3Var.f15314a;
        identityHashMap.remove(tVar);
        tVar.f15510a = 3;
        w3Var.r4(h3Var.f15315b, tVar);
        w3Var.f15594f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15624a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f15625b;
        a aVar = h3Var.f15315b;
        t tVar = h3Var.f15314a;
        w3 w3Var = h3Var.f15316c;
        if (!this.h && !this.f15628n && i11 == this.f15624a && objArr.length != 0 && objArr[0] == this.f15626c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f15513f = ((Float) objArr[4]).floatValue();
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof u4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f15628n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.Y3.remove(tVar);
                    tVar.f15511b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f15516j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f15517k = i13;
                    }
                    tVar.f15518l = 0;
                    tVar.f15519m = 0;
                    tVar.f15513f = 0.0f;
                    w3Var.o4(aVar);
                    w3Var.M4(h3Var.f15315b, tVar, str, true, tVar.f15516j, tVar.f15517k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
