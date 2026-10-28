package li;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17603a;
    public final h3 f17604b;
    public MessageObject f17605c;
    public VideoEditedInfo d;
    public String e;
    public boolean f17606f;
    public boolean h;
    public boolean f17607n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f17603a = i10;
        this.f17604b = h3Var;
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
        if (!this.f17607n && !this.h) {
            this.h = true;
            if (this.f17605c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f17605c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f17607n) {
            return;
        }
        this.f17607n = true;
        d();
        h3 h3Var = this.f17604b;
        v3 v3Var = h3Var.f17280c;
        IdentityHashMap identityHashMap = v3Var.f17548i4;
        t tVar = h3Var.f17278a;
        identityHashMap.remove(tVar);
        tVar.f17476a = 3;
        v3Var.w4(h3Var.f17279b, tVar);
        v3Var.f17556p3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f17603a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f17604b;
        a aVar = h3Var.f17279b;
        t tVar = h3Var.f17278a;
        v3 v3Var = h3Var.f17280c;
        if (!this.h && !this.f17607n && i11 == this.f17603a && objArr.length != 0 && objArr[0] == this.f17605c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f17479f = ((Float) objArr[4]).floatValue();
                View F1 = v3Var.F1(aVar);
                if (F1 instanceof u4) {
                    F1.requestLayout();
                    F1.invalidate();
                }
                if (longValue > 0) {
                    this.f17607n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    v3Var.f17548i4.remove(tVar);
                    tVar.f17477b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f17482j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f17483k = i13;
                    }
                    tVar.f17484l = 0;
                    tVar.f17485m = 0;
                    tVar.f17479f = 0.0f;
                    v3Var.t4(aVar);
                    v3Var.R4(h3Var.f17279b, tVar, str, true, tVar.f17482j, tVar.f17483k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
