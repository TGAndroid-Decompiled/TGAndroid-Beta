package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class am5 extends e implements fn7 {
    public TextView a;
    public TextView b;
    public TextView c;
    public zc d;
    public LinearLayout e;
    public LinearLayout f;
    public int h;
    public AnimatorSet n;
    public String r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(ob6.M0(2131751097, null));
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yob.h(aob.a7, null, frameLayout);
        this.fragmentView.setOnTouchListener(new b02((byte) 12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setWeightSum(100.0f);
        frameLayout.addView(this.f, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(hl.L(20.0f), hl.L(20.0f), hl.L(20.0f), hl.L(20.0f));
        this.f.addView(frameLayout2, tre.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, tre.c(-1.0f, -1));
        zc zcVar = new zc((byte) 27, context, this);
        this.d = zcVar;
        yob.h(aob.d6, null, zcVar);
        this.f.addView(this.d, tre.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        this.d.addView(this.e, tre.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.b = textView;
        int i = aob.B6;
        yob.X(textView, i, null);
        this.b.setGravity(17);
        this.b.setTypeface(Typeface.MONOSPACE);
        this.b.setTextSize(1, 16.0f);
        this.e.addView(this.b, tre.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.a = textView2;
        yob.X(textView2, i, null);
        yob.G(this.a, aob.J6, null);
        this.a.setTextSize(1, 16.0f);
        this.a.setLinksClickable(true);
        this.a.setClickable(true);
        this.a.setGravity(17);
        this.a.setMovementMethod(new dl((byte) 2));
        this.e.addView(this.a, tre.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        yob.X(textView3, i, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 32.0f);
        this.d.addView(this.c, tre.c(-2.0f, -2));
        TLRPC.EncryptedChat a1 = uc7.s1(this.currentAccount).a1(Integer.valueOf(this.h));
        if (a1 != null) {
            bm5 bm5Var = new bm5();
            imageView.setImageDrawable(bm5Var);
            byte[] bArr = a1.key_hash;
            bm5Var.a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(a1.auth_key), 0, bArr2, 0, 16);
                bm5Var.a = bArr2;
                a1.key_hash = bArr2;
            }
            bm5Var.invalidateSelf();
            TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(a1.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb = new StringBuilder();
            byte[] bArr3 = a1.key_hash;
            if (bArr3.length > 16) {
                String f = Utilities.f(bArr3);
                for (int i2 = 0; i2 < 32; i2++) {
                    if (i2 != 0) {
                        if (i2 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i2 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i3 = i2 << 1;
                    spannableStringBuilder.append((CharSequence) f.substring(i3, i3 + 2));
                    spannableStringBuilder.append(' ');
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i4 = 0; i4 < 5; i4++) {
                    byte[] bArr4 = a1.key_hash;
                    int i5 = i4 << 2;
                    int i6 = ((bArr4[i5 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i5 + 17] & 255) << 16) | ((bArr4[i5 + 18] & 255) << 8) | (bArr4[i5 + 19] & 255);
                    if (i4 != 0) {
                        sb.append(" ");
                    }
                    sb.append(jx3.c[i6 % 333]);
                }
                this.r = sb.toString();
            }
            this.b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = X1.first_name;
            spannableStringBuilder.append((CharSequence) hl.S2(ob6.a0("EncryptionKeyDescription", null, 2131751096, str, str)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new h8c(ob6.M0(2131751095, null), null), indexOf, indexOf + 12, 33);
            }
            this.a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        this.c.setAlpha(0.0f);
        this.b.setAlpha(1.0f);
        this.c.setScaleX(0.0f);
        this.c.setScaleY(0.0f);
        this.b.setScaleX(1.0f);
        this.b.setScaleY(1.0f);
        this.c.setTag(Integer.valueOf(aob.Ef));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i == jn7.l4 && (textView = this.c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 5));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        jn7.e().b(this, jn7.l4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.l4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 5));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        String str;
        if (z && !z2 && (str = this.r) != null) {
            TextView textView = this.c;
            textView.setText(pv3.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }
}
