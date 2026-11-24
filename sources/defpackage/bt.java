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
import org.telegram.ui.ActionBar.d;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class bt implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public bt(t54 t54Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = (byte) 8;
        this.d = t54Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        int i;
        lbc lbcVar;
        byte b = this.a;
        int i2 = 2;
        int i3 = 0;
        int i4 = this.c;
        int i5 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                cv0 cv0Var = (cv0) obj;
                while (i3 < i5 - i4) {
                    cv0Var.goBack();
                    i3++;
                }
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", y6c.h(i5).e());
                bundle.putInt("message_id", i4);
                ((d) obj).presentFragment(new mu1(bundle));
                return;
            case 2:
                ((ScrollView) obj).scrollTo(0, Math.max(0, (gl.L(44.0f) * i5) - (i4 / 2)));
                return;
            case 3:
                xb2 xb2Var = (xb2) obj;
                if (i5 != 0) {
                    SharedPreferences sharedPreferences = na7.q1(i4).W3;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i5).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                xb2Var.p(i5);
                return;
            case 4:
                rb2 rb2Var = (rb2) obj;
                if (i5 != 0) {
                    SharedPreferences sharedPreferences2 = na7.q1(i4).W3;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i5).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                rb2Var.a(Integer.valueOf(i5));
                return;
            case 5:
                ((ConnectionsManager) obj).lambda$discardConnection$0(i5, i4);
                return;
            case 6:
                zk3 zk3Var = (zk3) obj;
                try {
                    SQLiteCursor queryFinalized = ad7.Y(i5).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    vf6 vf6Var = new vf6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (cf3.B(longValue)) {
                            if (i4 == 0 || i4 == 3) {
                                int i6 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i6))) {
                                    arrayList3.add(Integer.valueOf(i6));
                                    i = i2;
                                    ?? obj2 = new Object();
                                    obj2.c = longValue;
                                    obj2.b = queryFinalized.intValue(1);
                                    arrayList4.add(obj2);
                                    vf6Var.k(obj2, obj2.c);
                                }
                            }
                            i = i2;
                        } else if (cf3.D(longValue)) {
                            if (i4 != i2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                i = i2;
                                ?? obj22 = new Object();
                                obj22.c = longValue;
                                obj22.b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                vf6Var.k(obj22, obj22.c);
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
                                vf6Var.k(obj222, obj222.c);
                            }
                        }
                        i2 = i;
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        ad7.Y(i5).T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                            al3 al3Var = (al3) vf6Var.f(cf3.E(((TLRPC.EncryptedChat) arrayList6.get(i7)).id));
                            if (al3Var != null) {
                                al3Var.a = (TLObject) arrayList6.get(i7);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        ad7.Y(i5).P(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i8);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                al3 al3Var2 = (al3) vf6Var.f(j2);
                                vf6Var.l(j2);
                                if (al3Var2 != null) {
                                    arrayList4.remove(al3Var2);
                                }
                            } else {
                                al3 al3Var3 = (al3) vf6Var.f(j2);
                                if (al3Var3 != null) {
                                    al3Var3.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ad7.Y(i5).k0(arrayList, arrayList5, false);
                        while (i3 < arrayList5.size()) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i3);
                            al3 al3Var4 = (al3) vf6Var.f(user.id);
                            if (al3Var4 != null) {
                                al3Var4.a = user;
                            }
                            i3++;
                        }
                    }
                    Collections.sort(arrayList4, new mz2((byte) 13));
                    gl.c3(new mg3(zk3Var, arrayList4, vf6Var, (byte) 5));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 7:
                y54 y54Var = (y54) obj;
                y54Var.m.e(24, new ll0(i5, i4, (byte) 2));
                y54Var.m1(2, 14, new wia(i5, i4));
                return;
            case 8:
                ((t54) obj).a.f1(i5, i4);
                return;
            case 9:
                a86 a86Var = (a86) obj;
                if (a86Var.d != i5 || a86Var.e != i4) {
                    a86Var.d = i5;
                    a86Var.e = i4;
                    a86Var.requestLayout();
                    ((u76) a86Var.a.a).n = 0L;
                    return;
                }
                return;
            case 10:
                MediaController mediaController = (MediaController) ((dd) obj).c;
                if (i5 == mediaController.l0 && i4 == 4 && (lbcVar = mediaController.k0) != null) {
                    try {
                        lbcVar.l0();
                        mediaController.k0 = null;
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                return;
            case 11:
                ((hq6) obj).Z[i5] = i4;
                return;
            case 12:
                f37 f37Var = (f37) ((fu) obj).g3;
                View b2 = f37Var.b();
                fu fuVar = f37Var.f;
                if (b2 != null) {
                    int top = b2.getTop() + i5;
                    int top2 = b2.getTop() + i4;
                    int i9 = top2 - top;
                    int paddingTop = fuVar.getPaddingTop();
                    int height = fuVar.getHeight() - fuVar.getPaddingBottom();
                    if (i9 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i10 = top - paddingTop;
                    if (i10 < 0) {
                        fuVar.scrollBy(0, i10);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                PushListenerController.lambda$sendRegistrationToServer$0(i5, i4, (String) obj);
                return;
            case 14:
                ScreenCapturerAndroid.a((ScreenCapturerAndroid) obj, i5, i4);
                return;
            case 15:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i5, i4);
                return;
            case 16:
                SurfaceViewRenderer.a((SurfaceViewRenderer) obj, i5, i4);
                return;
            case 17:
                ((TextureViewRenderer) obj).lambda$updateVideoSizes$1(i5, i4);
                return;
            case 18:
                VoIPGroupNotification.d((Context) obj, i5, i4);
                return;
            default:
                ((VoIPService) obj).lambda$initiateActualEncryptedCall$82(i5, i4);
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
