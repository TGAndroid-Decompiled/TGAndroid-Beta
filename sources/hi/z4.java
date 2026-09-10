package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class z4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f10028a;
    public final k3 f10029b;
    public MessageObject f10030c;
    public VideoEditedInfo d;
    public String e;
    public boolean f10031f;
    public boolean h;
    public boolean f10032n;

    public z4(int i10, MediaController.PhotoEntry photoEntry, k3 k3Var) {
        this.f10028a = i10;
        this.f10029b = k3Var;
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
        if (!this.f10032n && !this.h) {
            this.h = true;
            if (this.f10030c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f10030c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f10032n) {
            return;
        }
        this.f10032n = true;
        d();
        k3 k3Var = this.f10029b;
        z3 z3Var = k3Var.f9704c;
        IdentityHashMap identityHashMap = z3Var.f9992a4;
        v vVar = k3Var.f9702a;
        identityHashMap.remove(vVar);
        vVar.f9894a = 3;
        z3Var.p4(k3Var.f9703b, vVar);
        z3Var.f10001h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f10028a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k3 k3Var = this.f10029b;
        a aVar = k3Var.f9703b;
        v vVar = k3Var.f9702a;
        z3 z3Var = k3Var.f9704c;
        if (!this.h && !this.f10032n && i11 == this.f10028a && objArr.length != 0 && objArr[0] == this.f10030c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                vVar.f9897f = ((Float) objArr[4]).floatValue();
                View y12 = z3Var.y1(aVar);
                if (y12 instanceof x4) {
                    y12.requestLayout();
                    y12.invalidate();
                }
                if (longValue > 0) {
                    this.f10032n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    z3Var.f9992a4.remove(vVar);
                    vVar.f9895b = true;
                    vVar.e = str;
                    if (i12 > 0) {
                        vVar.f9900j = i12;
                    }
                    if (i13 > 0) {
                        vVar.f9901k = i13;
                    }
                    vVar.f9902l = 0;
                    vVar.f9903m = 0;
                    vVar.f9897f = 0.0f;
                    z3Var.m4(aVar);
                    z3Var.K4(k3Var.f9703b, vVar, str, true, vVar.f9900j, vVar.f9901k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
