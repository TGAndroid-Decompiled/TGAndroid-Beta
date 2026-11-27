package defpackage;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb2 {
    public final boolean a;
    public final ImageReceiver b;
    public final rb0 c;
    public final RectF d;
    public final v41 e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public hf0 k;
    public int l;
    public va6 m;
    public boolean n;
    public final float[] o;

    public sb2(wb2 wb2Var, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(wb2Var);
        this.b = imageReceiver;
        this.c = new rb0((vnb) null);
        this.d = new RectF();
        this.e = new v41(wb2Var);
        this.o = new float[8];
        this.a = z;
        imageReceiver.q0(hl.L(16.0f) / 2);
        if (wb2Var.O0) {
            imageReceiver.I();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i) {
        boolean z;
        int L;
        int i2;
        int i3;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L2 = i - hl.L(22.0f);
        this.j = hl.L(16.0f);
        StaticLayout X2 = wb2.X2(L2, wb2.Jd, str);
        this.f = X2;
        if (X2 != null) {
            int L3 = hl.L(4.0f) + wb2.N1(X2);
            L2 -= L3;
            this.j = uh9.w(6.0f, L3, this.j);
        }
        int i4 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.b;
        if (z) {
            rb0 rb0Var = this.c;
            rb0Var.o(tLObject);
            imageReceiver.U(tLObject, rb0Var, null);
            L2 -= hl.L(21.0f);
            int i5 = this.j;
            if (this.f == null) {
                i3 = hl.L(6.0f);
            } else {
                i3 = 0;
            }
            this.j = uh9.w(21.0f, i3, i5);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder O3 = wb2.O3(charSequence2);
        int i6 = i / 2;
        if (O3 == null) {
            L = 0;
        } else {
            L = hl.L(4.0f) + Math.min(i6, (int) Math.ceil(wb2.Kd.measureText(O3, 0, O3.length())));
        }
        StaticLayout X22 = wb2.X2(L2 - L, textPaint, charSequence);
        this.g = X22;
        if (X22 != null) {
            int L4 = hl.L(4.0f) + wb2.N1(X22);
            L2 -= L4;
            int i7 = this.j;
            if (this.f == null && !this.i) {
                i2 = hl.L(6.0f);
            } else {
                i2 = 0;
            }
            this.j = i2 + L4 + i7;
        }
        if (L2 > hl.L(24.0f)) {
            staticLayout = wb2.X2(Math.min(i6, L2), wb2.Kd, O3);
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i8 = this.j;
            if (this.f == null && !this.i && this.g == null) {
                i4 = hl.L(6.0f);
            }
            this.j = wb2.N1(this.h) + i4 + i8;
        } else if (this.g == null && this.f == null) {
        } else {
            this.j -= hl.L(4.0f);
        }
    }
}
