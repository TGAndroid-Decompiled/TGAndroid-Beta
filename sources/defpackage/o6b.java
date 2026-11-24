package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.e;
public final class o6b implements jac {
    public final byte a;
    public final Object b;

    public o6b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        long duration;
        float f;
        float f2;
        l7c l7cVar;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                u6b u6bVar = (u6b) obj3;
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar2 = (l7c) obj2;
                if (u6bVar.c2 || u6bVar.b2 != null) {
                    TLRPC.WebPage webPage = u6bVar.b2;
                    p6b p6bVar = new p6b(u6bVar, (byte) 0);
                    int i = s6b.b;
                    c6c K = c6c.K(s6b.class);
                    K.H = webPage;
                    K.E = p6bVar;
                    arrayList.add(K);
                }
                arrayList.add(c6c.k(u6bVar.T1));
                arrayList.add(c6c.B(1, null));
                c6c i2 = c6c.i(2, jb6.M0(2131744323, null));
                i2.L(u6bVar.h2);
                arrayList.add(i2);
                if (u6bVar.h2) {
                    arrayList.add(c6c.k(u6bVar.U1));
                }
                arrayList.add(c6c.B(3, null));
                arrayList.add(c6c.k(u6bVar.V1));
                return;
            case 1:
                v9b v9bVar = (v9b) obj3;
                Boolean bool = (Boolean) obj;
                Float f3 = (Float) obj2;
                if (v9bVar.Y0.getDuration() < 100) {
                    duration = v9bVar.L1.h0;
                } else {
                    duration = v9bVar.Y0.getDuration();
                }
                float floatValue = ((f3.floatValue() / 0.96f) * 0.04f) + f3.floatValue();
                g6b g6bVar = v9bVar.L1;
                float f4 = g6bVar.a0;
                float f5 = g6bVar.Z;
                float f6 = (f4 - f5) * floatValue;
                float f7 = (float) duration;
                long j = f6 * f7;
                k9b k9bVar = v9bVar.Y0;
                long j2 = (f5 * f7) + ((float) j);
                v9bVar.N1 = j2;
                k9bVar.m(j2);
                z8b z8bVar = v9bVar.w1;
                if (z8bVar != null) {
                    z8bVar.setCoverTime(v9bVar.N1);
                }
                g6b g6bVar2 = v9bVar.L1;
                if (g6bVar2 != null && g6bVar2.g) {
                    g6bVar2.j = true;
                    return;
                }
                return;
            case 2:
                ((hdb) obj3).Z((ArrayList) obj, (l7c) obj2);
                return;
            case 3:
                ((yfb) obj3).D0((ArrayList) obj, (l7c) obj2);
                return;
            case 4:
                xfb xfbVar = (xfb) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                l7c l7cVar3 = (l7c) obj2;
                arrayList2.add(c6c.k(xfbVar.T1));
                arrayList2.add(c6c.k(xfbVar.U1));
                return;
            case 5:
                ((eqb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 6:
                ((wqb) obj3).Z((ArrayList) obj, (l7c) obj2);
                return;
            case 7:
                krb krbVar = (krb) obj3;
                jz4 jz4Var = krbVar.F;
                Bitmap bitmap = (Bitmap) obj2;
                krbVar.r = (Bitmap) obj;
                Paint paint = new Paint(1);
                krbVar.w = paint;
                Bitmap bitmap2 = krbVar.r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                krbVar.s = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (cmb.I.o()) {
                    f = 0.05f;
                } else {
                    f = 0.25f;
                }
                gm.i(colorMatrix, f);
                if (cmb.I.o()) {
                    f2 = -0.02f;
                } else {
                    f2 = -0.04f;
                }
                gm.h(colorMatrix, f2);
                krbVar.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                krbVar.x = new Matrix();
                jz4Var.a(bitmap);
                tl0.c(jz4Var, krbVar.b);
                krbVar.G.d();
                return;
            case 8:
                s1c s1cVar = (s1c) obj3;
                String str = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                c1c c1cVar = s1cVar.y1;
                r1c r1cVar = s1cVar.H1;
                if (str != null) {
                    s1cVar.O1 = false;
                    s1cVar.z1.setText(s1cVar.M0(str));
                    r1cVar.D(c1cVar);
                    return;
                } else if (!s1cVar.J) {
                    int i3 = 2131743633;
                    if (s1cVar.O1) {
                        s1cVar.dismiss();
                        nm7 e = nm7.e();
                        if (bool2.booleanValue()) {
                            i3 = 2131743634;
                        }
                        e.k(297, 1, jb6.M0(i3, null));
                        return;
                    }
                    c41 c41Var = new c41((FrameLayout) s1cVar.b, s1cVar.J0);
                    if (bool2.booleanValue()) {
                        i3 = 2131743634;
                    }
                    mlb.y(null, i3, c41Var, null);
                    n1c n1cVar = s1cVar.w1.e;
                    String str2 = s1cVar.v1;
                    s1cVar.u1 = str2;
                    n1cVar.setText(s1c.J0(str2, null, null));
                    r1cVar.D(c1cVar);
                    return;
                } else {
                    return;
                }
            case 9:
                ((n7c) obj3).Z((ArrayList) obj, (l7c) obj2);
                return;
            case 10:
                goc gocVar = (goc) obj3;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (password != null) {
                    gocVar.V0 = true;
                    gocVar.W0 = password.has_password;
                    va vaVar = gocVar.a;
                    if (vaVar != null && (l7cVar = vaVar.g3) != null) {
                        l7cVar.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                tmc tmcVar = (tmc) obj3;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    tmcVar.a(null);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        l11.u(S.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                tmcVar.a((tL_error2 == null || (r9 = tL_error2.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 12:
                WalletEngine2.HttpTransport.lambda$execute$0((e) obj3, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            case 13:
                String str3 = (String) obj;
                Boolean bool3 = (Boolean) obj2;
                ((asc) obj3).h = false;
                return;
            default:
                ((tm3) obj3).a((TLRPC.TL_messages_botWidgetQueryAnswer) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
