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
public final class sqa extends ny0 {
    public static final int Y1 = 0;
    public final ie0 S1;
    public final LinearLayout T1;
    public final LinearLayout U1;
    public boolean V1;
    public boolean W1;
    public l9c X1;

    public sqa(final Context context, final int i, final vnb vnbVar, final y0 y0Var) {
        super(1, vnbVar, context, true);
        int i2;
        int i3;
        this.a = i;
        this.u1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        ie0 ie0Var = new ie0(context, i, pj.b, vnbVar);
        this.S1 = ie0Var;
        ie0Var.setScaleX(0.6f);
        ie0Var.setScaleY(0.6f);
        ie0Var.setAlpha(0.0f);
        this.c.addView(ie0Var, 0, tre.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        iye.a(ie0Var);
        ie0Var.setOnClickListener(new ly(context, vnbVar, (byte) 2));
        TLRPC.EmojiGameInfo emojiGameInfo = uc7.s1(i).l5;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231063);
        linearLayout.addView(imageView, tre.t(80, 80, 1, 0, 0, 0, 8));
        int i4 = aob.j5;
        TextView b = zze.b(context, 20.0f, i4, true, null);
        b.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131744895, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131744894, null));
        spannableStringBuilder.setSpan(new e96(vnbVar), length, spannableStringBuilder.length(), 33);
        b.setText(spannableStringBuilder);
        linearLayout.addView(b, tre.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b2 = zze.b(context, 14.0f, i4, false, null);
        uh9.q(b2, 17, null, 2131744896);
        linearLayout.addView(b2, tre.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b3 = zze.b(context, 14.0f, aob.L6, true, null);
        b3.setText(ob6.M0(2131744898, null));
        linearLayout2.addView(b3, tre.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hjb hjbVar = new hjb(context, vnbVar);
        linearLayout2.addView(hjbVar, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        hjbVar.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        hjbVar.addView(tableRow2);
        pt ptVar = new pt(context, new int[]{2131231058, 2131231059, 2131231060, 2131231061, 2131231062, 2131231063, 2131231063}, vnbVar, hjbVar, (byte) 23);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) ptVar.g(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) ptVar.g(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) ptVar.g(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) ptVar.g(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) ptVar.g(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) ptVar.g(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) ptVar.g(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b4 = zze.b(context, 14.0f, aob.y6, false, null);
        b4.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        wm2 wm2Var = new wm2(2131231063, 0);
        wm2Var.d = false;
        wm2Var.I = 0.8f;
        wm2Var.J = 0.8f;
        spannableStringBuilder2.setSpan(wm2Var, 0, spannableStringBuilder2.length(), 33);
        b4.setText(hl.I2(ob6.M0(2131744897, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b4, tre.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, tre.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.U1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(hl.L(42.0f), hl.L(0.0f), hl.L(42.0f), hl.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final lu7 lu7Var = new lu7(context, vnbVar);
        lu7Var.setForceForceUseCenter(true);
        lu7Var.setText(ob6.M0(2131744899, null));
        lu7Var.setLeftPadding(hl.L(36.0f));
        yob.X(editTextBoldCursor, aob.G6, vnbVar);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = hl.L(16.0f);
        editTextBoldCursor.setPadding(hl.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        yob.C(editTextBoldCursor, aob.lg, vnbVar);
        yob.l(editTextBoldCursor, 36, aob.mg, vnbVar);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        editTextBoldCursor.setGravity(i2);
        editTextBoldCursor.setOnFocusChangeListener(new rt0(lu7Var, editTextBoldCursor, (byte) 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231056);
        linearLayout4.addView(imageView2, tre.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, tre.p(-1, -2, 1.0f, 119));
        lu7Var.e(editTextBoldCursor);
        lu7Var.addView(linearLayout4, tre.e(-1, -2, 48));
        linearLayout3.addView(lu7Var, tre.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.A6, null);
        lu7Var.addView(textView, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j = tL_emojiGameDiceInfo.prev_stake;
        j = j <= 0 ? 1000000000L : j;
        editTextBoldCursor.setText(nza.K0(j));
        float f = 1.0f;
        textView.setAlpha(1.0f);
        StringBuilder sb = new StringBuilder("≈");
        di0.h();
        sb.append(di0.f("USD", 2, (long) ((j / 1.0E9d) * uc7.s1(i).k4.k.i * 100.0d), false));
        textView.setText(sb.toString());
        final int[] iArr = {2};
        lu7Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new rqa(i, editTextBoldCursor, lu7Var, iArr, textView));
        r rVar = new r(context, vnbVar, editTextBoldCursor);
        long[] jArr = uc7.s1(i).U3;
        int i5 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.a;
            int i6 = 3;
            if (i5 < (length2 + 2) / 3) {
                LinearLayout j2 = uh9.j(context, 0);
                int i7 = 0;
                float f2 = f;
                while (true) {
                    int i8 = i5 * 3;
                    if (i7 < Math.min(i6, jArr.length - i8)) {
                        View view = (View) rVar.a(Long.valueOf(jArr[i8 + i7]));
                        if (i7 == 2) {
                            i3 = 0;
                        } else {
                            i3 = 6;
                        }
                        j2.addView(view, tre.q(0, 26, 1.0f, 112, 0, 0, i3, 0));
                        i7++;
                        i6 = 3;
                    }
                }
                this.U1.addView(j2, tre.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i5++;
                f = f2;
            } else {
                c51 c51Var = new c51(vnbVar, context, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                wm2 wm2Var2 = new wm2(2131231976, 0);
                wm2Var2.s = hl.L(f);
                spannableStringBuilder3.setSpan(wm2Var2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131744900, null));
                c51Var.i(spannableStringBuilder3, false, true);
                c51Var.setOnClickListener(new View.OnClickListener() {
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
                            int i9 = i;
                            int i10 = (parseDouble > (uc7.s1(i9).k4.V2.f() / 1.0E9d) ? 1 : (parseDouble == (uc7.s1(i9).k4.V2.f() / 1.0E9d) ? 0 : -1));
                            lu7 lu7Var2 = lu7Var;
                            int[] iArr2 = iArr;
                            if (i10 > 0) {
                                editTextBoldCursor2.setText(Double.toString(uc7.s1(i9).k4.V2.f() / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i11 = -iArr2[0];
                                iArr2[0] = i11;
                                hl.A3(i11, lu7Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < uc7.s1(i9).k4.U2.f() / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(uc7.s1(i9).k4.U2.f() / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i12 = -iArr2[0];
                                iArr2[0] = i12;
                                hl.A3(i12, lu7Var2, null);
                            } else if (jxa.v(i9, true).f.toDouble() < parseDouble) {
                                new shb(context, vnbVar, oj.j((long) (parseDouble * 1.0E9d), pj.b), new kc((byte) 10));
                            } else {
                                y0Var.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                sqa.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(c51Var, tre.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.b;
                int i9 = this.u0;
                viewGroup.addView(frameLayout, tre.f(-2.0f, -1, 87, i9, 0, i9, 0));
                d79 d79Var = this.n1;
                int i10 = this.u0;
                d79Var.setPadding(i10, 0, i10, hl.L(68.0f));
                this.X1.O(false);
                return;
            }
        }
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new hj8(this, (byte) 22), this.J0);
        this.X1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131744895, null);
    }

    @Override
    public final boolean U(float f, float f2) {
        ie0 ie0Var = this.S1;
        if (f >= ie0Var.getX() && f <= ie0Var.getX() + ie0Var.getWidth() && f2 >= ie0Var.getY() && f2 <= ie0Var.getY() + ie0Var.getHeight()) {
            return false;
        }
        return super.U(f, f2);
    }

    public final void Z0() {
        boolean z;
        float f;
        if (this.V1 && !this.J && !this.d) {
            z = true;
        } else {
            z = false;
        }
        if (this.W1 != z) {
            this.W1 = z;
            ie0 ie0Var = this.S1;
            if (ie0Var != null) {
                ie0Var.setEnabled(z);
                ie0Var.setClickable(z);
                ViewPropertyAnimator animate = ie0Var.animate();
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
                ik8.s(scaleY, f3, 180L);
            }
        }
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        Z0();
    }

    @Override
    public final void k0() {
        this.V1 = false;
        Z0();
    }

    @Override
    public final void x() {
        this.V1 = true;
        Z0();
    }
}
