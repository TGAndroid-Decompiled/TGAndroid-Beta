package ki;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f15621a;
    public final h3 f15622b;
    public MessageObject f15623c;
    public VideoEditedInfo d;
    public String e;
    public boolean f15624f;
    public boolean h;
    public boolean f15625n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f15621a = i10;
        this.f15622b = h3Var;
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
        if (!this.f15625n && !this.h) {
            this.h = true;
            if (this.f15623c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f15623c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f15625n) {
            return;
        }
        this.f15625n = true;
        d();
        h3 h3Var = this.f15622b;
        w3 w3Var = h3Var.f15313c;
        IdentityHashMap identityHashMap = w3Var.Y3;
        t tVar = h3Var.f15311a;
        identityHashMap.remove(tVar);
        tVar.f15507a = 3;
        w3Var.r4(h3Var.f15312b, tVar);
        w3Var.f15591f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15621a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f15622b;
        a aVar = h3Var.f15312b;
        t tVar = h3Var.f15311a;
        w3 w3Var = h3Var.f15313c;
        if (!this.h && !this.f15625n && i11 == this.f15621a && objArr.length != 0 && objArr[0] == this.f15623c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f15510f = ((Float) objArr[4]).floatValue();
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof u4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f15625n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.Y3.remove(tVar);
                    tVar.f15508b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f15513j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f15514k = i13;
                    }
                    tVar.f15515l = 0;
                    tVar.f15516m = 0;
                    tVar.f15510f = 0.0f;
                    w3Var.o4(aVar);
                    w3Var.M4(h3Var.f15312b, tVar, str, true, tVar.f15513j, tVar.f15514k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
