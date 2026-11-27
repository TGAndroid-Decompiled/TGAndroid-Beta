package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
public final class bt implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public bt(n64 n64Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = (byte) 8;
        this.d = n64Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        int i;
        kfc kfcVar;
        byte b = this.a;
        int i2 = 2;
        int i3 = 0;
        int i4 = this.c;
        int i5 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                while (i3 < i5 - i4) {
                    nv0Var.goBack();
                    i3++;
                }
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yac.h(i5).e());
                bundle.putInt("message_id", i4);
                ((e) obj).presentFragment(new zu1(bundle));
                return;
            case 2:
                ((ScrollView) obj).scrollTo(0, Math.max(0, (hl.L(44.0f) * i5) - (i4 / 2)));
                return;
            case 3:
                nc2 nc2Var = (nc2) obj;
                if (i5 != 0) {
                    SharedPreferences sharedPreferences = uc7.s1(i4).X3;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i5).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                nc2Var.q(i5);
                return;
            case 4:
                hc2 hc2Var = (hc2) obj;
                if (i5 != 0) {
                    SharedPreferences sharedPreferences2 = uc7.s1(i4).X3;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i5).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                hc2Var.a(Integer.valueOf(i5));
                return;
            case 5:
                ((ConnectionsManager) obj).lambda$discardConnection$0(i5, i4);
                return;
            case 6:
                rl3 rl3Var = (rl3) obj;
                try {
                    SQLiteCursor queryFinalized = kf7.a0(i5).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    zh6 zh6Var = new zh6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (wf3.B(longValue)) {
                            if (i4 == 0 || i4 == 3) {
                                int i6 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i6))) {
                                    arrayList3.add(Integer.valueOf(i6));
                                    i = i2;
                                    ?? obj2 = new Object();
                                    obj2.c = longValue;
                                    obj2.b = queryFinalized.intValue(1);
                                    arrayList4.add(obj2);
                                    zh6Var.k(obj2.c, obj2);
                                }
                            }
                            i = i2;
                        } else if (wf3.D(longValue)) {
                            if (i4 != i2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                i = i2;
                                ?? obj22 = new Object();
                                obj22.c = longValue;
                                obj22.b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                zh6Var.k(obj22.c, obj22);
                            }
                            i = i2;
                        } else {
                            long j = -longValue;
                            i = i2;
                            if (!arrayList2.contains(Long.valueOf(j))) {
                                arrayList2.add(Long.valueOf(j));
                                ?? obj222 = new Object();
                                obj222.c = longValue;
                                obj222.b = queryFinalized.intValue(1);
                                arrayList4.add(obj222);
                                zh6Var.k(obj222.c, obj222);
                            }
                        }
                        i2 = i;
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        kf7.a0(i5).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                            sl3 sl3Var = (sl3) zh6Var.f(wf3.E(((TLRPC.EncryptedChat) arrayList6.get(i7)).id));
                            if (sl3Var != null) {
                                sl3Var.a = (TLObject) arrayList6.get(i7);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        kf7.a0(i5).R(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i8);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                sl3 sl3Var2 = (sl3) zh6Var.f(j2);
                                zh6Var.l(j2);
                                if (sl3Var2 != null) {
                                    arrayList4.remove(sl3Var2);
                                }
                            } else {
                                sl3 sl3Var3 = (sl3) zh6Var.f(j2);
                                if (sl3Var3 != null) {
                                    sl3Var3.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        kf7.a0(i5).m0(arrayList, arrayList5, false);
                        while (i3 < arrayList5.size()) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i3);
                            sl3 sl3Var4 = (sl3) zh6Var.f(user.id);
                            if (sl3Var4 != null) {
                                sl3Var4.a = user;
                            }
                            i3++;
                        }
                    }
                    Collections.sort(arrayList4, new f03((byte) 13));
                    hl.c3(new cv2(rl3Var, arrayList4, zh6Var, (byte) 9));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 7:
                s64 s64Var = (s64) obj;
                s64Var.m.e(24, new ml0(i5, i4, (byte) 2));
                s64Var.m1(2, 14, new rma(i5, i4));
                return;
            case 8:
                ((n64) obj).a.f1(i5, i4);
                return;
            case 9:
                ea6 ea6Var = (ea6) obj;
                if (ea6Var.d != i5 || ea6Var.e != i4) {
                    ea6Var.d = i5;
                    ea6Var.e = i4;
                    ea6Var.requestLayout();
                    ((x96) ea6Var.a.b).n = 0L;
                    return;
                }
                return;
            case 10:
                MediaController mediaController = (MediaController) ((ed) obj).c;
                if (i5 == mediaController.l0 && i4 == 4 && (kfcVar = mediaController.k0) != null) {
                    try {
                        kfcVar.l0();
                        mediaController.k0 = null;
                        return;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        return;
                    }
                }
                return;
            case 11:
                ((ls6) obj).Z[i5] = i4;
                return;
            case 12:
                m57 m57Var = (m57) ((gu) obj).g3;
                View b2 = m57Var.b();
                gu guVar = m57Var.f;
                if (b2 != null) {
                    int top = b2.getTop() + i5;
                    int top2 = b2.getTop() + i4;
                    int i9 = top2 - top;
                    int paddingTop = guVar.getPaddingTop();
                    int height = guVar.getHeight() - guVar.getPaddingBottom();
                    if (i9 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i10 = top - paddingTop;
                    if (i10 < 0) {
                        guVar.scrollBy(0, i10);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                PushListenerController.lambda$sendRegistrationToServer$0(i5, i4, (String) obj);
                return;
            case 14:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i5, i4);
                return;
            case 15:
                SurfaceViewRenderer.a((SurfaceViewRenderer) obj, i5, i4);
                return;
            case 16:
                bnb bnbVar = (bnb) obj;
                bnbVar.J = null;
                bnbVar.e = i5;
                bnbVar.f = i4;
                bnbVar.g();
                bnbVar.requestLayout();
                return;
            case 17:
                VoIPGroupNotification.d((Context) obj, i5, i4);
                return;
            default:
                ((VoIPService) obj).lambda$initiateActualEncryptedCall$83(i5, i4);
                return;
        }
    }

    public bt(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public bt(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
