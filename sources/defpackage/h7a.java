package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.SessionsActivity;
public final class h7a extends FrameLayout implements tjb, gk7 {
    public final be0 a;
    public final xw0 b;
    public final wd1 c;
    public int d;
    public int e;
    public final SessionsActivity f;

    public h7a(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f = sessionsActivity;
        wd1 wd1Var = new wd1();
        this.c = wd1Var;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        wd1Var.j = false;
        wd1Var.n = 1.2f;
        be0Var.setOnClickListener(new g6(this, (byte) 14));
        int i = bkb.F6;
        bkb.w0(null, i, false);
        int i2 = bkb.c6;
        bkb.w0(null, i2, false);
        int i3 = bkb.Ei;
        bkb.w0(null, i3, false);
        bkb.w0(null, i2, false);
        l46 l46Var = new l46(context, null);
        addView(l46Var, nme.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        l46Var.setGravity(1);
        zkb.X(l46Var, i, null);
        l46Var.setTextSize(1, 15.0f);
        zkb.G(l46Var, bkb.I6, null);
        zkb.C(l46Var, bkb.J6, null);
        String M0 = k96.M0(2131753886, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i4 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i4);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            l46Var.setMovementMethod(new cl((byte) 0));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i4, (CharSequence) "");
            spannableStringBuilder.setSpan(new g4c(k96.M0(2131753890, null), (vib) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i5 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i5);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            l46Var.setMovementMethod(new cl((byte) 0));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i5, (CharSequence) "");
            spannableStringBuilder.setSpan(new g4c(k96.M0(2131753880, null), (vib) null), indexOf3, indexOf4 - 1, 33);
        }
        l46Var.setText(spannableStringBuilder);
        xw0 xw0Var = new xw0((byte) 5, context, this);
        this.b = xw0Var;
        xw0Var.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        xw0Var.setGravity(17);
        xw0Var.setTextSize(1, 14.0f);
        xw0Var.setTypeface(gl.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) k96.M0(2131748725, null));
        spannableStringBuilder3.setSpan(new cm2(0, getContext().getDrawable(2131232251)), 0, 1, 0);
        xw0Var.setText(spannableStringBuilder3);
        zkb.X(xw0Var, bkb.Ii, null);
        int L = gl.L(24.0f);
        int w0 = bkb.w0(null, i3, false);
        int w02 = bkb.w0(null, bkb.Gi, false);
        xw0Var.setBackground(bkb.i0(L, L, L, L, w0, w02, w02));
        xw0Var.setOnClickListener(new ik8(this, (byte) 23));
        addView(xw0Var, nme.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i;
        TLRPC.Document document;
        int i2;
        boolean z;
        int i3;
        SessionsActivity sessionsActivity = this.f;
        i = ((d) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet q0 = hq6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            i3 = ((d) sessionsActivity).currentAccount;
            q0 = hq6.d0(i3).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        kcb kcbVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            kcbVar = uo3.d(document.thumbs, bkb.b7, 0.2f, false);
        }
        kcb kcbVar2 = kcbVar;
        if (kcbVar2 != null) {
            kcbVar2.e = 512;
            kcbVar2.f = 512;
        }
        if (document == null) {
            i2 = ((d) sessionsActivity).currentAccount;
            hq6 d0 = hq6.d0(i2);
            if (tL_messages_stickerSet == null) {
                z = true;
            } else {
                z = false;
            }
            d0.d1("tg_placeholders_android", false, z);
            return;
        }
        gl5 b = gl5.b(document);
        be0 be0Var = this.a;
        be0Var.n(b, "130_130", "tgs", kcbVar2, tL_messages_stickerSet);
        be0Var.getImageReceiver().M(2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        a();
        i = ((d) this.f).currentAccount;
        kk7.f(i).b(this, kk7.x0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        i = ((d) this.f).currentAccount;
        kk7.f(i).n(this, kk7.x0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.Ei, false);
            int w02 = bkb.w0(null, bkb.Gi, false);
            xw0 xw0Var = this.b;
            if (xw0Var != null && (w0 != this.d || w02 != this.e)) {
                this.d = w0;
                this.e = w02;
                int L = gl.L(24.0f);
                xw0Var.setBackground(bkb.i0(L, L, L, L, w0, w02, w02));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
