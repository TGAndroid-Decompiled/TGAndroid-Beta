package ki;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f15683a;
    public final h3 f15684b;
    public MessageObject f15685c;
    public VideoEditedInfo d;
    public String e;
    public boolean f15686f;
    public boolean h;
    public boolean f15687n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f15683a = i10;
        this.f15684b = h3Var;
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
        if (!this.f15687n && !this.h) {
            this.h = true;
            if (this.f15685c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f15685c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f15687n) {
            return;
        }
        this.f15687n = true;
        d();
        h3 h3Var = this.f15684b;
        w3 w3Var = h3Var.f15374c;
        IdentityHashMap identityHashMap = w3Var.f15647b4;
        t tVar = h3Var.f15372a;
        identityHashMap.remove(tVar);
        tVar.f15568a = 3;
        w3Var.w4(h3Var.f15373b, tVar);
        w3Var.f15656i3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15683a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f15684b;
        a aVar = h3Var.f15373b;
        t tVar = h3Var.f15372a;
        w3 w3Var = h3Var.f15374c;
        if (!this.h && !this.f15687n && i11 == this.f15683a && objArr.length != 0 && objArr[0] == this.f15685c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f15571f = ((Float) objArr[4]).floatValue();
                View F1 = w3Var.F1(aVar);
                if (F1 instanceof u4) {
                    F1.requestLayout();
                    F1.invalidate();
                }
                if (longValue > 0) {
                    this.f15687n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.f15647b4.remove(tVar);
                    tVar.f15569b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f15574j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f15575k = i13;
                    }
                    tVar.f15576l = 0;
                    tVar.f15577m = 0;
                    tVar.f15571f = 0.0f;
                    w3Var.t4(aVar);
                    w3Var.R4(h3Var.f15373b, tVar, str, true, tVar.f15574j, tVar.f15575k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
