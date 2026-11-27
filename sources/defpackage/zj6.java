package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class zj6 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final tsb K;
    public final ck6 L;
    public int a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported n;
    public int r;
    public final Paint s;
    public final Paint w;
    public final RectF x;
    public final ImageView y;

    public zj6(ck6 ck6Var, Context context) {
        super(context);
        this.L = ck6Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new RectF();
        this.F = 1.0f;
        this.K = new tsb();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i = aob.G6;
        yob.X(textView, i, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i2 = aob.y6;
        yob.X(textView2, i2, null);
        linearLayout.addView(textView2, tre.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231247));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.Li, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new sa5(this, (byte) 25));
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        addView(imageView, tre.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        yob.h(aob.d6, null, this);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        yob.X(textView3, i, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(hl.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, tre.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        yob.X(textView4, i2, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, tre.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f, int i) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return aob.w0(null, aob.lk, false);
        }
        if (i == 3) {
            return aob.w0(null, aob.ka, false);
        }
        if (i == 1) {
            if (f > 0.5f) {
                return vm2.f(1.0f - ((f - 0.5f) / 0.5f), aob.w0(null, aob.na, false), aob.w0(null, aob.oa, false));
            }
            return vm2.f(1.0f - (f / 0.5f), aob.w0(null, aob.oa, false), aob.w0(null, aob.ka, false));
        } else if (i == 2) {
            return aob.w0(null, aob.oa, false);
        } else {
            if (i == 4) {
                return aob.w0(null, aob.V8, false);
            }
            return aob.w0(null, aob.Fi, false);
        }
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        this.J = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.F = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = hl.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.y;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder b1 = nza.b1(false, "⭐️ ".concat(ob6.E(tL_chatInviteExported.subscription_pricing.amount, ',')), 0.75f, null);
            TextView textView = this.f;
            textView.setText(b1);
            int i6 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i6 == 2592000) {
                textView2.setText(ob6.M0(2131744713, null));
            } else if (i6 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i6 == 60) {
                textView2.setText("each minute");
            }
            L = hl.L(28.0f) + ((int) Math.max(kg5.h(textView.getText(), textView.getPaint()), kg5.h(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        ck6 ck6Var = this.L;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            pv3.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb = new StringBuilder();
            i2 = ((e) ck6Var).currentAccount;
            sb.append(uc7.s1(i2).N2);
            sb.append("/");
            sb.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb.toString());
        } else {
            boolean startsWith = tL_chatInviteExported.link.startsWith("https://t.me/joinchat/");
            String str2 = tL_chatInviteExported.link;
            if (startsWith) {
                textView3.setText(str2.substring(22));
            } else {
                boolean startsWith2 = str2.startsWith("https://");
                String str3 = tL_chatInviteExported.link;
                if (startsWith2) {
                    textView3.setText(str3.substring(8));
                } else {
                    textView3.setText(str3);
                }
            }
        }
        int i7 = tL_chatInviteExported.usage;
        int i8 = 2131747918;
        if (i7 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            if (tL_chatInviteExported.subscription_pricing != null) {
                i5 = 2131747916;
            } else {
                i5 = 2131747918;
            }
            str = ob6.M0(i5, null);
        } else {
            int i9 = tL_chatInviteExported.usage_limit;
            if (i9 > 0 && i7 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                str = ob6.G(i9, "CanJoin", new Object[0]);
            } else if (i9 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                str = ob6.G(i7, "PeopleJoined", new Object[0]) + ", " + ob6.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                if (i7 > 0) {
                    str = ob6.G(i7, "PeopleJoined", new Object[0]);
                } else {
                    str = "";
                }
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        str = str.concat(", ");
                    }
                    str = str.concat(ob6.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            np3 np3Var = new np3();
            np3Var.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131747048, null));
        } else if (!tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.expire_date > 0) {
                np3 np3Var2 = new np3();
                np3Var2.b = hl.L(1.5f);
                spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((ck6Var.o0 * 1000) + System.currentTimeMillis());
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 86400000) {
                    spannableStringBuilder2.append((CharSequence) ob6.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
                } else {
                    long j = currentTimeMillis / 1000;
                    int i10 = (int) (j % 60);
                    long j2 = j / 60;
                    Locale locale = Locale.ENGLISH;
                    spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j2 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j2 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i10)));
                    this.J = true;
                }
            }
        } else {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i8 = 2131747916;
                }
                String M0 = ob6.M0(i8, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) M0);
            }
            np3 np3Var3 = new np3();
            np3Var3.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z = tL_chatInviteExported.revoked;
            if (!z && (i4 = tL_chatInviteExported.usage_limit) > 0 && tL_chatInviteExported.usage >= i4) {
                spannableStringBuilder2.append((CharSequence) ob6.M0(2131748654, null));
            } else {
                if (z) {
                    i3 = 2131745742;
                } else {
                    i3 = 2131750841;
                }
                spannableStringBuilder2.append((CharSequence) ob6.M0(i3, null));
            }
        }
        if (tL_chatInviteExported.request_needed) {
            np3 np3Var4 = new np3();
            np3Var4.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131754202, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824));
        this.w.setStrokeWidth(hl.L(2.0f));
    }
}
