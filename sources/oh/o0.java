package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pr;
public final class o0 extends FrameLayout implements p70 {
    public final TextView B;
    public final TextView C;
    public final oq[] D;
    public final oq[] E;
    public int F;
    public ValueAnimator G;
    public t0 H;
    public final Paint I;
    public boolean f17527a;
    public boolean f17528b;
    public final int f17529c;
    public final boolean d;
    public Drawable f17530e;
    public float f17531f;
    public final dg.u h;
    public final LinearLayout f17532n;
    public final jh.s f17533r;
    public final jh.s f17534s;
    public CharSequence v;
    public final org.telegram.ui.Components.p9 f17535w;
    public final org.telegram.ui.Components.z8 f17536x;
    public final jh.s f17537y;

    public o0(int i10, Context context, boolean z4) {
        super(context);
        this.f17527a = false;
        this.f17528b = true;
        this.f17531f = 0.5f;
        this.D = new oq[1];
        this.E = new oq[1];
        this.I = new Paint(1);
        this.f17529c = i10;
        this.d = z4;
        dg.u uVar = new dg.u(this, context);
        this.h = uVar;
        uVar.setOrientation(0);
        addView(uVar, k7.c6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f17536x = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f17535w = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        uVar.addView(p9Var, k7.c6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        uVar.addView(linearLayout, k7.c6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f17532n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, k7.c6.n(-2, -2));
        jh.s sVar = new jh.s(context);
        this.f17533r = sVar;
        sVar.setTextColor(-1);
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(3);
        sVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(sVar, k7.c6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        jh.s sVar2 = new jh.s(context);
        this.f17534s = sVar2;
        sVar2.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.55f, -1));
        sVar2.setTextSize(1, 12.0f);
        sVar2.setGravity(5);
        linearLayout2.addView(sVar2, k7.c6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        jh.s sVar3 = new jh.s(context);
        this.f17537y = sVar3;
        sVar3.setTextColor(-1);
        sVar3.setTextSize(1, 14.0f);
        sVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.k6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(sVar3);
        linearLayout.addView(sVar3, k7.c6.n(-2, -2));
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        uVar.addView(textView, k7.c6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.C = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        uVar.addView(textView2, k7.c6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        dg.u uVar = this.h;
        if (uVar.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.k6.l1(f10 * 0.5f, -16777216);
            Paint paint = this.I;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(uVar.getX(), uVar.getY(), uVar.getX() + uVar.getWidth(), uVar.getY() + uVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
            Drawable drawable = this.f17530e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f17531f * 255.0f));
                this.h.invalidate();
            }
        }
        t0 t0Var = this.H;
        if (t0Var != null && this.f17530e != null) {
            this.F = t0Var.f17755a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new eg.m1(this, 23));
            this.G.addListener(new dg.l0(this, 17));
            this.G.setDuration(350L);
            this.G.setInterpolator(pr.h);
            this.G.start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(t0 t0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z4;
        int i10;
        CharSequence charSequence;
        int i11;
        boolean z10;
        float f10;
        this.H = t0Var;
        dg.u uVar = this.h;
        if ((t0Var == null || this.F != t0Var.f17755a) && (valueAnimator = this.G) != null) {
            valueAnimator.cancel();
            this.G = null;
            Drawable drawable = this.f17530e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f17531f * 255.0f));
                uVar.invalidate();
            }
        }
        long j10 = t0Var.f17757c;
        org.telegram.ui.Components.p9 p9Var = this.f17535w;
        org.telegram.ui.Components.z8 z8Var = this.f17536x;
        int i12 = this.f17529c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(t0Var.f17757c));
            z8Var.r(user);
            p9Var.e(user, z8Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-t0Var.f17757c));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
        }
        int b10 = s.b(i12, (int) t0Var.f17760g, 3);
        int b11 = s.b(i12, (int) t0Var.f17760g, 4);
        int b12 = s.b(i12, (int) t0Var.f17760g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z11 = t0Var.f17756b;
        boolean z12 = this.d;
        jh.s sVar = this.f17537y;
        if (z11 && t0Var.f17760g <= 0) {
            z4 = z12;
        } else {
            if (t0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + t0Var.h));
                z4 = z12;
                oq oqVar = new oq(0, new j0(getContext(), t0Var.h));
                oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z4 = z12;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, sVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z4) {
                i10 = 33;
                spannableStringBuilder.setSpan(new m0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = s.b(i12, (int) t0Var.f17760g, 1);
        int b14 = s.b(i12, (int) t0Var.f17760g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = t0Var.f17759f;
        if (tL_textWithEntities == null) {
            charSequence = " ";
            this.v = "";
        } else {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, sVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !t0Var.f17756b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (!(charSequence2 instanceof Spannable)) {
                charSequence = " ";
            } else {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.u5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (u5VarArr.length + emojiSpanArr.length <= b14 || t0Var.f17756b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i13 = 0;
                    while (i13 < u5VarArr.length) {
                        org.telegram.ui.Components.u5[] u5VarArr2 = u5VarArr;
                        int i14 = i13;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(u5VarArr2[i13])), Integer.valueOf(spannable.getSpanEnd(u5VarArr2[i14]))));
                        i13 = i14 + 1;
                        u5VarArr = u5VarArr2;
                    }
                    int i15 = 0;
                    while (i15 < emojiSpanArr.length) {
                        int i16 = i15;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i15])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i16]))));
                        i15 = i16 + 1;
                    }
                    Collections.sort(arrayList, new k0(0));
                    if (!(this.v instanceof SpannableStringBuilder)) {
                        this.v = new SpannableStringBuilder(this.v);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!t0Var.f17756b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        }
        sVar.setText(Emoji.replaceEmoji(spannableStringBuilder, sVar.getPaint().getFontMetricsInt(), false));
        this.f17530e = null;
        if (t0Var.f17756b && t0Var.f17760g <= 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f17532n.setVisibility(i11);
        long j11 = t0Var.f17760g;
        TextView textView = this.C;
        TextView textView2 = this.B;
        if (j11 > 0) {
            if (j11 >= 250) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17527a = z10;
            uVar.setWillNotDraw(!z10);
            uVar.invalidate();
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i17 = org.telegram.ui.ActionBar.k6.f21598a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.f17530e = gradientDrawable;
            uVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.f17530e;
            if (!z4) {
                f10 = 0.65f;
            } else {
                f10 = 1.0f;
            }
            this.f17531f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (!t0Var.f17758e) {
                textView.setVisibility(0);
                textView.setText(ja.U0(false, l.d.l(t0Var.f17760g, ',', new StringBuilder("⭐️ ")), 0.75f, this.E, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.k6.l1(0.25f, b12)));
                textView2.setText(ja.U0(false, l.d.l(t0Var.f17760g, ',', new StringBuilder("⭐️ ")), 0.75f, this.D, AndroidUtilities.dp(0.66f), 1.0f));
                oq oqVar2 = this.D[0];
                if (oqVar2 != null) {
                    oqVar2.draw = this.f17528b;
                }
            }
        } else if (t0Var.f17756b) {
            this.f17527a = false;
            uVar.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.f17530e = b02;
            uVar.setBackground(b02);
            Drawable drawable3 = this.f17530e;
            this.f17531f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i12, t0Var.f17757c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new l0(), length, spannableStringBuilder2.length(), 33);
            this.f17533r.setText(spannableStringBuilder2);
            this.f17534s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f17527a = false;
            uVar.setWillNotDraw(true);
            sVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.k6.l1(0.6f, -16777216));
            this.f17530e = null;
            uVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        uVar.invalidate();
    }

    public void setDrawStar(boolean z4) {
        this.f17528b = z4;
        oq oqVar = this.D[0];
        if (oqVar != null && oqVar.draw != z4) {
            oqVar.draw = z4;
            this.B.invalidate();
        }
    }
}
