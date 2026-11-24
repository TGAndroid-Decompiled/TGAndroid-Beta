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
public final class cu implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public cu(c74 c74Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = (byte) 8;
        this.d = c74Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        int i;
        ndc ndcVar;
        byte b = this.a;
        int i2 = 2;
        int i3 = 0;
        int i4 = this.c;
        int i5 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                mw0 mw0Var = (mw0) obj;
                while (i3 < i5 - i4) {
                    mw0Var.goBack();
                    i3++;
                }
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", z8c.h(i5).e());
                bundle.putInt("message_id", i4);
                ((d) obj).presentFragment(new yv1(bundle));
                return;
            case 2:
                ((ScrollView) obj).scrollTo(0, Math.max(0, (gm.L(44.0f) * i5) - (i4 / 2)));
                return;
            case 3:
                id2 id2Var = (id2) obj;
                if (i5 != 0) {
                    SharedPreferences sharedPreferences = oc7.r1(i4).W3;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i5).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                id2Var.t(i5);
                return;
            case 4:
                cd2 cd2Var = (cd2) obj;
                if (i5 != 0) {
                    SharedPreferences sharedPreferences2 = oc7.r1(i4).W3;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i5).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                cd2Var.a(Integer.valueOf(i5));
                return;
            case 5:
                ((ConnectionsManager) obj).lambda$discardConnection$0(i5, i4);
                return;
            case 6:
                km3 km3Var = (km3) obj;
                try {
                    SQLiteCursor queryFinalized = cf7.Y(i5).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    vh6 vh6Var = new vh6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (pg3.B(longValue)) {
                            if (i4 == 0 || i4 == 3) {
                                int i6 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i6))) {
                                    arrayList3.add(Integer.valueOf(i6));
                                    i = i2;
                                    ?? obj2 = new Object();
                                    obj2.c = longValue;
                                    obj2.b = queryFinalized.intValue(1);
                                    arrayList4.add(obj2);
                                    vh6Var.k(obj2, obj2.c);
                                }
                            }
                            i = i2;
                        } else if (pg3.D(longValue)) {
                            if (i4 != i2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                i = i2;
                                ?? obj22 = new Object();
                                obj22.c = longValue;
                                obj22.b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                vh6Var.k(obj22, obj22.c);
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
                                vh6Var.k(obj222, obj222.c);
                            }
                        }
                        i2 = i;
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        cf7.Y(i5).T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                            lm3 lm3Var = (lm3) vh6Var.f(pg3.E(((TLRPC.EncryptedChat) arrayList6.get(i7)).id));
                            if (lm3Var != null) {
                                lm3Var.a = (TLObject) arrayList6.get(i7);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        cf7.Y(i5).P(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i8);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                lm3 lm3Var2 = (lm3) vh6Var.f(j2);
                                vh6Var.l(j2);
                                if (lm3Var2 != null) {
                                    arrayList4.remove(lm3Var2);
                                }
                            } else {
                                lm3 lm3Var3 = (lm3) vh6Var.f(j2);
                                if (lm3Var3 != null) {
                                    lm3Var3.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        cf7.Y(i5).k0(arrayList, arrayList5, false);
                        while (i3 < arrayList5.size()) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i3);
                            lm3 lm3Var4 = (lm3) vh6Var.f(user.id);
                            if (lm3Var4 != null) {
                                lm3Var4.a = user;
                            }
                            i3++;
                        }
                    }
                    Collections.sort(arrayList4, new x03((byte) 13));
                    gm.c3(new pz2(km3Var, arrayList4, vh6Var, (byte) 7));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 7:
                h74 h74Var = (h74) obj;
                h74Var.m.e(24, new lm0(i5, i4, (byte) 2));
                h74Var.m1(2, 14, new yka(i5, i4));
                return;
            case 8:
                ((c74) obj).a.f1(i5, i4);
                return;
            case 9:
                z96 z96Var = (z96) obj;
                if (z96Var.d != i5 || z96Var.e != i4) {
                    z96Var.d = i5;
                    z96Var.e = i4;
                    z96Var.requestLayout();
                    ((t96) z96Var.a.a).n = 0L;
                    return;
                }
                return;
            case 10:
                MediaController mediaController = (MediaController) ((de) obj).c;
                if (i5 == mediaController.l0 && i4 == 4 && (ndcVar = mediaController.k0) != null) {
                    try {
                        ndcVar.l0();
                        mediaController.k0 = null;
                        return;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        return;
                    }
                }
                return;
            case 11:
                ((hs6) obj).Z[i5] = i4;
                return;
            case 12:
                f57 f57Var = (f57) ((fv) obj).g3;
                View b2 = f57Var.b();
                fv fvVar = f57Var.f;
                if (b2 != null) {
                    int top = b2.getTop() + i5;
                    int top2 = b2.getTop() + i4;
                    int i9 = top2 - top;
                    int paddingTop = fvVar.getPaddingTop();
                    int height = fvVar.getHeight() - fvVar.getPaddingBottom();
                    if (i9 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i10 = top - paddingTop;
                    if (i10 < 0) {
                        fvVar.scrollBy(0, i10);
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

    public cu(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public cu(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
