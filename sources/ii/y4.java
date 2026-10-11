package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f12857a;
    public final i3 f12858b;
    public MessageObject f12859c;
    public VideoEditedInfo d;
    public String f12860e;
    public boolean f12861f;
    public boolean h;
    public boolean f12862n;

    public y4(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f12857a = i10;
        this.f12858b = i3Var;
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
        if (!this.f12862n && !this.h) {
            this.h = true;
            if (this.f12859c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f12859c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f12862n) {
            return;
        }
        this.f12862n = true;
        d();
        i3 i3Var = this.f12858b;
        x3 x3Var = i3Var.f12489c;
        IdentityHashMap identityHashMap = x3Var.Y3;
        u uVar = i3Var.f12487a;
        identityHashMap.remove(uVar);
        uVar.f12709a = 3;
        x3Var.r4(i3Var.f12488b, uVar);
        x3Var.f12808f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f12857a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f12858b;
        a aVar = i3Var.f12488b;
        u uVar = i3Var.f12487a;
        x3 x3Var = i3Var.f12489c;
        if (!this.h && !this.f12862n && i11 == this.f12857a && objArr.length != 0 && objArr[0] == this.f12859c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f12713f = ((Float) objArr[4]).floatValue();
                View A1 = x3Var.A1(aVar);
                if (A1 instanceof w4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f12862n = true;
                    d();
                    String str = this.f12860e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.Y3.remove(uVar);
                    uVar.f12710b = true;
                    uVar.f12712e = str;
                    if (i12 > 0) {
                        uVar.f12716j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f12717k = i13;
                    }
                    uVar.f12718l = 0;
                    uVar.f12719m = 0;
                    uVar.f12713f = 0.0f;
                    x3Var.o4(aVar);
                    x3Var.M4(i3Var.f12488b, uVar, str, true, uVar.f12716j, uVar.f12717k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
