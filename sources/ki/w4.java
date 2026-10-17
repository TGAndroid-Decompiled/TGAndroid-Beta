package ki;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f15616a;
    public final h3 f15617b;
    public MessageObject f15618c;
    public VideoEditedInfo d;
    public String e;
    public boolean f15619f;
    public boolean h;
    public boolean f15620n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f15616a = i10;
        this.f15617b = h3Var;
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
        if (!this.f15620n && !this.h) {
            this.h = true;
            if (this.f15618c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f15618c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f15620n) {
            return;
        }
        this.f15620n = true;
        d();
        h3 h3Var = this.f15617b;
        w3 w3Var = h3Var.f15308c;
        IdentityHashMap identityHashMap = w3Var.Y3;
        t tVar = h3Var.f15306a;
        identityHashMap.remove(tVar);
        tVar.f15502a = 3;
        w3Var.r4(h3Var.f15307b, tVar);
        w3Var.f15586f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15616a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f15617b;
        a aVar = h3Var.f15307b;
        t tVar = h3Var.f15306a;
        w3 w3Var = h3Var.f15308c;
        if (!this.h && !this.f15620n && i11 == this.f15616a && objArr.length != 0 && objArr[0] == this.f15618c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f15505f = ((Float) objArr[4]).floatValue();
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof u4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f15620n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.Y3.remove(tVar);
                    tVar.f15503b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f15508j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f15509k = i13;
                    }
                    tVar.f15510l = 0;
                    tVar.f15511m = 0;
                    tVar.f15505f = 0.0f;
                    w3Var.o4(aVar);
                    w3Var.M4(h3Var.f15307b, tVar, str, true, tVar.f15508j, tVar.f15509k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
