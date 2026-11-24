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
import org.telegram.ui.ActionBar.d;
public final class xj5 extends d implements gk7 {
    public TextView a;
    public TextView b;
    public TextView c;
    public yc d;
    public LinearLayout e;
    public LinearLayout f;
    public int h;
    public AnimatorSet n;
    public String r;

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(k96.M0(2131751120, null));
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 29));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zkb.h(bkb.Z6, null, frameLayout);
        this.fragmentView.setOnTouchListener(new jz1((byte) 12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setWeightSum(100.0f);
        frameLayout.addView(this.f, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(gl.L(20.0f), gl.L(20.0f), gl.L(20.0f), gl.L(20.0f));
        this.f.addView(frameLayout2, nme.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, nme.c(-1.0f, -1));
        yc ycVar = new yc((byte) 26, context, this);
        this.d = ycVar;
        zkb.h(bkb.c6, null, ycVar);
        this.f.addView(this.d, nme.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        this.d.addView(this.e, nme.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.b = textView;
        int i = bkb.A6;
        zkb.X(textView, i, null);
        this.b.setGravity(17);
        this.b.setTypeface(Typeface.MONOSPACE);
        this.b.setTextSize(1, 16.0f);
        this.e.addView(this.b, nme.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.a = textView2;
        zkb.X(textView2, i, null);
        zkb.G(this.a, bkb.I6, null);
        this.a.setTextSize(1, 16.0f);
        this.a.setLinksClickable(true);
        this.a.setClickable(true);
        this.a.setGravity(17);
        this.a.setMovementMethod(new cl((byte) 2));
        this.e.addView(this.a, nme.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        zkb.X(textView3, i, null);
        this.c.setGravity(17);
        this.c.setTextSize(1, 32.0f);
        this.d.addView(this.c, nme.c(-2.0f, -2));
        TLRPC.EncryptedChat Y0 = na7.q1(this.currentAccount).Y0(Integer.valueOf(this.h));
        if (Y0 != null) {
            yj5 yj5Var = new yj5();
            imageView.setImageDrawable(yj5Var);
            byte[] bArr = Y0.key_hash;
            yj5Var.a = bArr;
            if (bArr == null) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(Utilities.n(Y0.auth_key), 0, bArr2, 0, 16);
                yj5Var.a = bArr2;
                Y0.key_hash = bArr2;
            }
            yj5Var.invalidateSelf();
            TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(Y0.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb = new StringBuilder();
            byte[] bArr3 = Y0.key_hash;
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
                    byte[] bArr4 = Y0.key_hash;
                    int i5 = i4 << 2;
                    int i6 = ((bArr4[i5 + 16] & Byte.MAX_VALUE) << 24) | ((bArr4[i5 + 17] & 255) << 16) | ((bArr4[i5 + 18] & 255) << 8) | (bArr4[i5 + 19] & 255);
                    if (i4 != 0) {
                        sb.append(" ");
                    }
                    sb.append(ow3.c[i6 % 333]);
                }
                this.r = sb.toString();
            }
            this.b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            String str = V1.first_name;
            spannableStringBuilder.append((CharSequence) gl.S2(k96.a0("EncryptionKeyDescription", null, 2131751119, str, str)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new i4c(k96.M0(2131751118, null), null), indexOf, indexOf + 12, 33);
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
        this.c.setTag(Integer.valueOf(bkb.Df));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i == kk7.k4 && (textView = this.c) != null) {
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 5));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        kk7.e().b(this, kk7.k4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 5));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        String str;
        if (z && !z2 && (str = this.r) != null) {
            TextView textView = this.c;
            textView.setText(vu3.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }
}
