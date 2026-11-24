package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class woa extends mz0 {
    public static final int Y1 = 0;
    public final gf0 S1;
    public final LinearLayout T1;
    public final LinearLayout U1;
    public boolean V1;
    public boolean W1;
    public l7c X1;

    public woa(final Context context, final int i, final ylb ylbVar, final x0 x0Var) {
        super(1, ylbVar, context, true);
        int i2;
        int i3;
        this.a = i;
        this.u1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        gf0 gf0Var = new gf0(context, i, ok.b, ylbVar);
        this.S1 = gf0Var;
        gf0Var.setScaleX(0.6f);
        gf0Var.setScaleY(0.6f);
        gf0Var.setAlpha(0.0f);
        this.c.addView(gf0Var, 0, qoe.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        rve.a(gf0Var);
        gf0Var.setOnClickListener(new kz(context, ylbVar, (byte) 2));
        TLRPC.EmojiGameInfo emojiGameInfo = oc7.r1(i).m5;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231064);
        linearLayout.addView(imageView, qoe.t(80, 80, 1, 0, 0, 0, 8));
        int i4 = cmb.i5;
        TextView b = jxe.b(context, 20.0f, i4, true, null);
        b.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131744927, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131744926, null));
        spannableStringBuilder.setSpan(new a96(ylbVar), length, spannableStringBuilder.length(), 33);
        b.setText(spannableStringBuilder);
        linearLayout.addView(b, qoe.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b2 = jxe.b(context, 14.0f, i4, false, null);
        hg9.p(b2, 17, null, 2131744928);
        linearLayout.addView(b2, qoe.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b3 = jxe.b(context, 14.0f, cmb.K6, true, null);
        b3.setText(jb6.M0(2131744930, null));
        linearLayout2.addView(b3, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        mhb mhbVar = new mhb(context, ylbVar);
        linearLayout2.addView(mhbVar, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        mhbVar.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        mhbVar.addView(tableRow2);
        lu luVar = new lu(context, new int[]{2131231059, 2131231060, 2131231061, 2131231062, 2131231063, 2131231064, 2131231064}, ylbVar, mhbVar, (byte) 21);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) luVar.j(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) luVar.j(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) luVar.j(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) luVar.j(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) luVar.j(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) luVar.j(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) luVar.j(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b4 = jxe.b(context, 14.0f, cmb.x6, false, null);
        b4.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        pn2 pn2Var = new pn2(2131231064, 0);
        pn2Var.d = false;
        pn2Var.I = 0.8f;
        pn2Var.J = 0.8f;
        spannableStringBuilder2.setSpan(pn2Var, 0, spannableStringBuilder2.length(), 33);
        b4.setText(gm.I2(jb6.M0(2131744929, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b4, qoe.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, qoe.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.U1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(gm.L(42.0f), gm.L(0.0f), gm.L(42.0f), gm.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final gt7 gt7Var = new gt7(context, ylbVar);
        gt7Var.setForceForceUseCenter(true);
        gt7Var.setText(jb6.M0(2131744931, null));
        gt7Var.setLeftPadding(gm.L(36.0f));
        anb.X(editTextBoldCursor, cmb.F6, ylbVar);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = gm.L(16.0f);
        editTextBoldCursor.setPadding(gm.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        anb.C(editTextBoldCursor, cmb.kg, ylbVar);
        anb.l(editTextBoldCursor, 36, cmb.lg, ylbVar);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        editTextBoldCursor.setGravity(i2);
        editTextBoldCursor.setOnFocusChangeListener(new ru0(gt7Var, editTextBoldCursor, (byte) 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231057);
        linearLayout4.addView(imageView2, qoe.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, qoe.p(-1, -2, 1.0f, 119));
        gt7Var.e(editTextBoldCursor);
        gt7Var.addView(linearLayout4, qoe.e(-1, -2, 48));
        linearLayout3.addView(gt7Var, qoe.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.z6, null);
        gt7Var.addView(textView, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j = tL_emojiGameDiceInfo.prev_stake;
        j = j <= 0 ? 1000000000L : j;
        editTextBoldCursor.setText(nxa.K0(j));
        float f = 1.0f;
        textView.setAlpha(1.0f);
        StringBuilder sb = new StringBuilder("≈");
        cj0.h();
        sb.append(cj0.f("USD", 2, (long) ((j / 1.0E9d) * oc7.r1(i).l4.k.i * 100.0d), false));
        textView.setText(sb.toString());
        final int[] iArr = {2};
        gt7Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new voa(i, editTextBoldCursor, gt7Var, iArr, textView));
        r rVar = new r(context, ylbVar, editTextBoldCursor);
        long[] jArr = oc7.r1(i).U3;
        int i5 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.a;
            int i6 = 3;
            if (i5 < (length2 + 2) / 3) {
                LinearLayout i7 = hg9.i(context, 0);
                int i8 = 0;
                float f2 = f;
                while (true) {
                    int i9 = i5 * 3;
                    if (i8 < Math.min(i6, jArr.length - i9)) {
                        View view = (View) rVar.a(Long.valueOf(jArr[i9 + i8]));
                        if (i8 == 2) {
                            i3 = 0;
                        } else {
                            i3 = 6;
                        }
                        i7.addView(view, qoe.q(0, 26, 1.0f, 112, 0, 0, i3, 0));
                        i8++;
                        i6 = 3;
                    }
                }
                this.U1.addView(i7, qoe.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i5++;
                f = f2;
            } else {
                b61 b61Var = new b61(ylbVar, context, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                pn2 pn2Var2 = new pn2(2131231977, 0);
                pn2Var2.s = gm.L(f);
                spannableStringBuilder3.setSpan(pn2Var2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131744932, null));
                b61Var.i(spannableStringBuilder3, false, true);
                b61Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        double parseDouble;
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        Editable text = editTextBoldCursor2.getText();
                        try {
                            if (TextUtils.isEmpty(text)) {
                                parseDouble = 0.0d;
                            } else {
                                parseDouble = Double.parseDouble(text.toString());
                            }
                            int i10 = i;
                            int i11 = (parseDouble > (oc7.r1(i10).l4.N2.f() / 1.0E9d) ? 1 : (parseDouble == (oc7.r1(i10).l4.N2.f() / 1.0E9d) ? 0 : -1));
                            gt7 gt7Var2 = gt7Var;
                            int[] iArr2 = iArr;
                            if (i11 > 0) {
                                editTextBoldCursor2.setText(Double.toString(oc7.r1(i10).l4.N2.f() / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i12 = -iArr2[0];
                                iArr2[0] = i12;
                                gm.A3(i12, gt7Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < oc7.r1(i10).l4.M2.f() / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(oc7.r1(i10).l4.M2.f() / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i13 = -iArr2[0];
                                iArr2[0] = i13;
                                gm.A3(i13, gt7Var2, null);
                            } else if (jva.v(i10, true).f.toDouble() < parseDouble) {
                                new xfb(context, ylbVar, nk.j((long) (parseDouble * 1.0E9d), ok.b), new jd((byte) 10));
                            } else {
                                x0Var.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                woa.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(b61Var, qoe.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.b;
                int i10 = this.u0;
                viewGroup.addView(frameLayout, qoe.f(-2.0f, -1, 87, i10, 0, i10, 0));
                r59 r59Var = this.n1;
                int i11 = this.u0;
                r59Var.setPadding(i11, 0, i11, gm.L(68.0f));
                this.X1.O(false);
                return;
            }
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vh8(this, (byte) 22), this.J0);
        this.X1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131744927, null);
    }

    @Override
    public final boolean T(float f, float f2) {
        gf0 gf0Var = this.S1;
        if (f >= gf0Var.getX() && f <= gf0Var.getX() + gf0Var.getWidth() && f2 >= gf0Var.getY() && f2 <= gf0Var.getY() + gf0Var.getHeight()) {
            return false;
        }
        return super.T(f, f2);
    }

    public final void Y0() {
        boolean z;
        float f;
        if (this.V1 && !this.J && !this.d) {
            z = true;
        } else {
            z = false;
        }
        if (this.W1 != z) {
            this.W1 = z;
            gf0 gf0Var = this.S1;
            if (gf0Var != null) {
                gf0Var.setEnabled(z);
                gf0Var.setClickable(z);
                ViewPropertyAnimator animate = gf0Var.animate();
                float f2 = 0.6f;
                float f3 = 1.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f);
                if (z) {
                    f2 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f2);
                if (!z) {
                    f3 = 0.0f;
                }
                wi8.s(scaleY, f3, 180L);
            }
        }
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        Y0();
    }

    @Override
    public final void k0() {
        this.V1 = false;
        Y0();
    }

    @Override
    public final void w() {
        this.V1 = true;
        Y0();
    }
}
