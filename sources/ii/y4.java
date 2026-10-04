package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f12811a;
    public final i3 f12812b;
    public MessageObject f12813c;
    public VideoEditedInfo d;
    public String f12814e;
    public boolean f12815f;
    public boolean h;
    public boolean f12816n;

    public y4(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f12811a = i10;
        this.f12812b = i3Var;
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
        if (!this.f12816n && !this.h) {
            this.h = true;
            if (this.f12813c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f12813c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f12816n) {
            return;
        }
        this.f12816n = true;
        d();
        i3 i3Var = this.f12812b;
        x3 x3Var = i3Var.f12442c;
        IdentityHashMap identityHashMap = x3Var.f12761h4;
        u uVar = i3Var.f12440a;
        identityHashMap.remove(uVar);
        uVar.f12662a = 3;
        x3Var.s4(i3Var.f12441b, uVar);
        x3Var.f12769o3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f12811a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f12812b;
        a aVar = i3Var.f12441b;
        u uVar = i3Var.f12440a;
        x3 x3Var = i3Var.f12442c;
        if (!this.h && !this.f12816n && i11 == this.f12811a && objArr.length != 0 && objArr[0] == this.f12813c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f12666f = ((Float) objArr[4]).floatValue();
                View B1 = x3Var.B1(aVar);
                if (B1 instanceof w4) {
                    B1.requestLayout();
                    B1.invalidate();
                }
                if (longValue > 0) {
                    this.f12816n = true;
                    d();
                    String str = this.f12814e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.f12761h4.remove(uVar);
                    uVar.f12663b = true;
                    uVar.f12665e = str;
                    if (i12 > 0) {
                        uVar.f12669j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f12670k = i13;
                    }
                    uVar.f12671l = 0;
                    uVar.f12672m = 0;
                    uVar.f12666f = 0.0f;
                    x3Var.p4(aVar);
                    x3Var.N4(i3Var.f12441b, uVar, str, true, uVar.f12669j, uVar.f12670k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
