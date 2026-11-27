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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class l8b implements icc {
    public final byte a;
    public final Object b;

    public l8b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        long duration;
        float f;
        float f2;
        l9c l9cVar;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                r8b r8bVar = (r8b) obj3;
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar2 = (l9c) obj2;
                if (r8bVar.c2 || r8bVar.b2 != null) {
                    TLRPC.WebPage webPage = r8bVar.b2;
                    m8b m8bVar = new m8b(r8bVar, (byte) 0);
                    int i = p8b.b;
                    b8c K = b8c.K(p8b.class);
                    K.H = webPage;
                    K.E = m8bVar;
                    arrayList.add(K);
                }
                arrayList.add(b8c.k(r8bVar.T1));
                arrayList.add(b8c.B(1, null));
                b8c i2 = b8c.i(2, ob6.M0(2131744291, null));
                i2.L(r8bVar.h2);
                arrayList.add(i2);
                if (r8bVar.h2) {
                    arrayList.add(b8c.k(r8bVar.U1));
                }
                arrayList.add(b8c.B(3, null));
                arrayList.add(b8c.k(r8bVar.V1));
                return;
            case 1:
                rbb rbbVar = (rbb) obj3;
                Boolean bool = (Boolean) obj;
                Float f3 = (Float) obj2;
                if (rbbVar.Y0.getDuration() < 100) {
                    duration = rbbVar.L1.h0;
                } else {
                    duration = rbbVar.Y0.getDuration();
                }
                float floatValue = ((f3.floatValue() / 0.96f) * 0.04f) + f3.floatValue();
                c8b c8bVar = rbbVar.L1;
                float f4 = c8bVar.a0;
                float f5 = c8bVar.Z;
                float f6 = (f4 - f5) * floatValue;
                float f7 = (float) duration;
                long j = f6 * f7;
                gbb gbbVar = rbbVar.Y0;
                long j2 = (f5 * f7) + ((float) j);
                rbbVar.N1 = j2;
                gbbVar.m(j2);
                vab vabVar = rbbVar.w1;
                if (vabVar != null) {
                    vabVar.setCoverTime(rbbVar.N1);
                }
                c8b c8bVar2 = rbbVar.L1;
                if (c8bVar2 != null && c8bVar2.g) {
                    c8bVar2.j = true;
                    return;
                }
                return;
            case 2:
                ((bfb) obj3).Y((ArrayList) obj, (l9c) obj2);
                return;
            case 3:
                ((thb) obj3).D0((ArrayList) obj, (l9c) obj2);
                return;
            case 4:
                shb shbVar = (shb) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                l9c l9cVar3 = (l9c) obj2;
                arrayList2.add(b8c.k(shbVar.T1));
                arrayList2.add(b8c.k(shbVar.U1));
                return;
            case 5:
                ((dsb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 6:
                ((vsb) obj3).Y((ArrayList) obj, (l9c) obj2);
                return;
            case 7:
                ktb ktbVar = (ktb) obj3;
                nz4 nz4Var = ktbVar.F;
                Bitmap bitmap = (Bitmap) obj2;
                ktbVar.r = (Bitmap) obj;
                Paint paint = new Paint(1);
                ktbVar.w = paint;
                Bitmap bitmap2 = ktbVar.r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ktbVar.s = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (aob.I.o()) {
                    f = 0.05f;
                } else {
                    f = 0.25f;
                }
                hl.i(colorMatrix, f);
                if (aob.I.o()) {
                    f2 = -0.02f;
                } else {
                    f2 = -0.04f;
                }
                hl.h(colorMatrix, f2);
                ktbVar.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ktbVar.x = new Matrix();
                nz4Var.a(bitmap);
                uk0.c(nz4Var, ktbVar.b);
                ktbVar.G.d();
                return;
            case 8:
                r3c r3cVar = (r3c) obj3;
                String str = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                b3c b3cVar = r3cVar.y1;
                q3c q3cVar = r3cVar.H1;
                if (str != null) {
                    r3cVar.O1 = false;
                    r3cVar.z1.setText(r3cVar.N0(str));
                    q3cVar.D(b3cVar);
                    return;
                } else if (!r3cVar.J) {
                    int i3 = 2131743601;
                    if (r3cVar.O1) {
                        r3cVar.dismiss();
                        jn7 e = jn7.e();
                        if (bool2.booleanValue()) {
                            i3 = 2131743602;
                        }
                        e.k(296, 1, ob6.M0(i3, null));
                        return;
                    }
                    d31 d31Var = new d31((FrameLayout) r3cVar.b, r3cVar.J0);
                    if (bool2.booleanValue()) {
                        i3 = 2131743602;
                    }
                    xnb.x(null, i3, d31Var, null);
                    m3c m3cVar = r3cVar.w1.e;
                    String str2 = r3cVar.v1;
                    r3cVar.u1 = str2;
                    m3cVar.setText(r3c.K0(str2, null, null));
                    q3cVar.D(b3cVar);
                    return;
                } else {
                    return;
                }
            case 9:
                ((n9c) obj3).Y((ArrayList) obj, (l9c) obj2);
                return;
            case 10:
                uqc uqcVar = (uqc) obj3;
                TL_account.Password password = (TL_account.Password) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (password != null) {
                    uqcVar.V0 = true;
                    uqcVar.W0 = password.has_password;
                    wa waVar = uqcVar.a;
                    if (waVar != null && (l9cVar = waVar.g3) != null) {
                        l9cVar.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                gpc gpcVar = (gpc) obj3;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    gpcVar.a(null);
                    e S = LaunchActivity.S();
                    if (S != null) {
                        m01.u(S.getContext(), onrampsession.url);
                        return;
                    }
                    return;
                }
                gpcVar.a((tL_error2 == null || (r9 = tL_error2.text) == null) ? "NO_SESSION" : "NO_SESSION");
                return;
            case 12:
                WalletEngine2.HttpTransport.lambda$execute$0((org.telegram.ui.Wallet.e) obj3, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                return;
            case 13:
                String str3 = (String) obj;
                Boolean bool3 = (Boolean) obj2;
                ((muc) obj3).h = false;
                return;
            default:
                ((am3) obj3).a((TLRPC.TL_messages_botWidgetQueryAnswer) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
