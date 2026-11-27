package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.SessionsActivity;
public final class yaa extends FrameLayout implements snb, fn7 {
    public final de0 a;
    public final fx0 b;
    public final fe1 c;
    public int d;
    public int e;
    public final SessionsActivity f;

    public yaa(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f = sessionsActivity;
        fe1 fe1Var = new fe1();
        this.c = fe1Var;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        fe1Var.j = false;
        fe1Var.n = 1.2f;
        de0Var.setOnClickListener(new h6(this, (byte) 14));
        int i = aob.G6;
        aob.w0(null, i, false);
        int i2 = aob.d6;
        aob.w0(null, i2, false);
        int i3 = aob.Fi;
        aob.w0(null, i3, false);
        aob.w0(null, i2, false);
        p66 p66Var = new p66(context, null);
        addView(p66Var, tre.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        p66Var.setGravity(1);
        yob.X(p66Var, i, null);
        p66Var.setTextSize(1, 15.0f);
        yob.G(p66Var, aob.J6, null);
        yob.C(p66Var, aob.K6, null);
        String M0 = ob6.M0(2131753882, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i4 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i4);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            p66Var.setMovementMethod(new dl((byte) 0));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i4, (CharSequence) "");
            spannableStringBuilder.setSpan(new f8c(ob6.M0(2131753886, null), (rmb) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i5 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i5);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            p66Var.setMovementMethod(new dl((byte) 0));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i5, (CharSequence) "");
            spannableStringBuilder.setSpan(new f8c(ob6.M0(2131753876, null), (rmb) null), indexOf3, indexOf4 - 1, 33);
        }
        p66Var.setText(spannableStringBuilder);
        fx0 fx0Var = new fx0((byte) 5, context, this);
        this.b = fx0Var;
        fx0Var.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        fx0Var.setGravity(17);
        fx0Var.setTextSize(1, 14.0f);
        fx0Var.setTypeface(hl.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) ob6.M0(2131748671, null));
        spannableStringBuilder3.setSpan(new wm2(0, getContext().getDrawable(2131232251)), 0, 1, 0);
        fx0Var.setText(spannableStringBuilder3);
        yob.X(fx0Var, aob.Ji, null);
        int L = hl.L(24.0f);
        int w0 = aob.w0(null, i3, false);
        int w02 = aob.w0(null, aob.Hi, false);
        fx0Var.setBackground(aob.i0(L, L, L, L, w0, w02, w02));
        fx0Var.setOnClickListener(new jn8(this, (byte) 25));
        addView(fx0Var, tre.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i;
        TLRPC.Document document;
        int i2;
        boolean z;
        int i3;
        SessionsActivity sessionsActivity = this.f;
        i = ((e) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet q0 = ls6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            i3 = ((e) sessionsActivity).currentAccount;
            q0 = ls6.d0(i3).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        ggb ggbVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            ggbVar = lp3.d(document.thumbs, aob.c7, 0.2f, false);
        }
        ggb ggbVar2 = ggbVar;
        if (ggbVar2 != null) {
            ggbVar2.e = 512;
            ggbVar2.f = 512;
        }
        if (document == null) {
            i2 = ((e) sessionsActivity).currentAccount;
            ls6 d0 = ls6.d0(i2);
            if (tL_messages_stickerSet == null) {
                z = true;
            } else {
                z = false;
            }
            d0.d1("tg_placeholders_android", false, z);
            return;
        }
        jn5 b = jn5.b(document);
        de0 de0Var = this.a;
        de0Var.n(b, "130_130", "tgs", ggbVar2, tL_messages_stickerSet);
        de0Var.getImageReceiver().M(2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        a();
        i = ((e) this.f).currentAccount;
        jn7.f(i).b(this, jn7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        i = ((e) this.f).currentAccount;
        jn7.f(i).n(this, jn7.y0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.Fi, false);
            int w02 = aob.w0(null, aob.Hi, false);
            fx0 fx0Var = this.b;
            if (fx0Var != null && (w0 != this.d || w02 != this.e)) {
                this.d = w0;
                this.e = w02;
                int L = hl.L(24.0f);
                fx0Var.setBackground(aob.i0(L, L, L, L, w0, w02, w02));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
