package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class e52 extends w29 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final ChatAttachAlertPhotoLayout w;

    public e52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final boolean E(o39 o39Var) {
        xl6 xl6Var;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if ((!isEmpty || ((xl6Var = chatAttachAlertPhotoLayout.U0) != null && !xl6Var.e.isEmpty())) && chatAttachAlertPhotoLayout.b.L1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        jm6 M = M(i);
        if (M == null) {
            int i2 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i <= i2) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
                if (!arrayList.isEmpty()) {
                    M = (jm6) arrayList.get(0);
                } else {
                    xl6 xl6Var = chatAttachAlertPhotoLayout.U0;
                    if (xl6Var != null) {
                        M = (jm6) xl6Var.e.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (jm6) b00.f(1, chatAttachAlertPhotoLayout.U0.e);
            }
        }
        if (M != null) {
            long j = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return k96.e0(j, true);
        }
        return "";
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (o39Var.getMeasuredHeight() - currentActionBarHeight)) * f;
        float f2 = measuredHeight;
        iArr[0] = ((int) (ceil / f2)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = o39Var.getPaddingTop() + ((int) (ceil % f2)) + ((int) ((1.0f - f) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(o39 o39Var) {
        byte b = this.w.N0;
        int ceil = (int) Math.ceil(this.n / b);
        if (o39Var.getChildCount() != 0) {
            int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
            View childAt = o39Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / b) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (o39Var.getMeasuredHeight() - a.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(o39 o39Var) {
        this.s = false;
        int childCount = o39Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            o39Var.getChildAt(i).invalidate();
        }
    }

    @Override
    public final void K() {
        this.s = true;
    }

    public final y29 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        o48 o48Var = new o48(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            o48Var.setOutlineProvider(new cl0(this, (byte) 4));
            o48Var.setClipToOutline(true);
        }
        o48Var.setFastScrollDelegate(new rh1(this, (byte) 16));
        o48Var.setDelegate(new q31(this, o48Var, (byte) 24));
        return new s49(o48Var);
    }

    public final jm6 M(int i) {
        boolean z = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z && i > chatAttachAlertPhotoLayout.N0) {
            i--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i--;
        }
        boolean z2 = ChatAttachAlertPhotoLayout.r1;
        return chatAttachAlertPhotoLayout.d0(i);
    }

    @Override
    public final int b() {
        int i = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        e52 e52Var = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z = chatAttachAlertPhotoLayout.Q0;
        if (z && this == e52Var) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i++;
        }
        if (z && this == e52Var) {
            i++;
        }
        this.r = i;
        if (!z) {
            i += ChatAttachAlertPhotoLayout.s1.size();
            xl6 xl6Var = chatAttachAlertPhotoLayout.U0;
            if (xl6Var != null) {
                i += xl6Var.e.size();
            }
        }
        if (this.e && i > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i++;
        }
        if (this == e52Var) {
            i++;
        }
        this.n = i;
        return i;
    }

    @Override
    public final int d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.d(int):int");
    }

    @Override
    public final void f() {
        int i;
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            g24 g24Var = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.w0) {
                i = 0;
            } else {
                i = 4;
            }
            g24Var.setVisibility(i);
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z6 = this.d;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 == 7) {
                        ((fr4) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                        return;
                    }
                    return;
                }
                i48 i48Var = (i48) view;
                i48Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                if (!z6 || !chatAttachAlertPhotoLayout.P0 || i != 0) {
                    i3 = 1;
                }
                i48Var.setType(i3);
                return;
            }
            ((h48) view).setItemSize(chatAttachAlertPhotoLayout.L0);
            return;
        }
        if (this.f && i > chatAttachAlertPhotoLayout.N0) {
            i--;
        }
        if (z6 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i--;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i--;
        }
        o48 o48Var = (o48) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            o48Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.s.o) {
                z = true;
            } else {
                z = false;
            }
            o48Var.setIsVertical(z);
        }
        if (x02Var.N2 == 0 && !x02Var.Q2 && !x02Var.B1) {
            o48Var.getCheckBox().setVisibility(0);
        } else {
            o48Var.getCheckBox().setVisibility(8);
        }
        jm6 d0 = chatAttachAlertPhotoLayout.d0(i);
        if (d0 == null) {
            return;
        }
        int i4 = d0.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z6 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i == b() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x02Var != null && x02Var.c2) {
            z5 = true;
        } else {
            z5 = false;
        }
        o48Var.d(d0, z2, z3, z4, z5);
        if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
            o48Var.b(ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(i4)), hashMap.containsKey(Integer.valueOf(i4)), false);
        } else {
            o48Var.b(-1, hashMap.containsKey(Integer.valueOf(i4)), false);
        }
        if (!chatAttachAlertPhotoLayout.x0 && d0.b) {
            o48Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.y0 && !d0.b) {
            o48Var.setAlpha(0.3f);
        } else {
            o48Var.setAlpha(1.0f);
        }
        o48Var.getImageView().setTag(Integer.valueOf(i));
        o48Var.setTag(Integer.valueOf(i));
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        wjb wjbVar = chatAttachAlertPhotoLayout.a;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i2 = bkb.Z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    zkb.s(imageView, i2, wjbVar, mode);
                                    frameLayout.addView(imageView, nme.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    zkb.s(imageView2, bkb.aa, wjbVar, mode);
                                    frameLayout.addView(imageView2, nme.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.c = textView;
                                    zkb.X(textView, bkb.ba, wjbVar);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, nme.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = gl.L(80.0f);
                                    return new s49(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new e49(-1, gl.L(56.0f)));
                                u41 u41Var = new u41(wjbVar, context, true);
                                u41Var.setUseWrapContent(true);
                                u41Var.f();
                                u41Var.setPadding(gl.L(28.0f), 0, gl.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new cm2(2131230927, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) k96.M0(2131750465, null));
                                u41Var.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(u41Var, nme.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s49(frameLayout2);
                            }
                            fr4 fr4Var = new fr4(context, x02Var.G3);
                            fr4Var.setLayoutParams(new e49(-1, gl.L(400.0f)));
                            fr4Var.setGravity(17);
                            fr4Var.isClickable();
                            fr4Var.b.setOnClickListener(new yj3(new j42(chatAttachAlertPhotoLayout, (byte) 5), (byte) 19));
                            fr4Var.a.setOnClickListener(new yj3(new j42(chatAttachAlertPhotoLayout, (byte) 6), (byte) 20));
                            fr4Var.c.setOnClickListener(new xf3(fr4Var, new be2(this, (byte) 18), (byte) 14));
                            return new s49(fr4Var);
                        }
                        return new s49(new View(context));
                    }
                    x02Var.getClass();
                    return new s49(new d52(this, context));
                }
                return new s49(new sb((byte) 4, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.a = gl.L(0.0f);
            return new s49(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            y29 y29Var = (y29) arrayList.get(0);
            arrayList.remove(0);
            return y29Var;
        }
        return L();
    }

    @Override
    public final void y(s49 s49Var) {
        if (s49Var.a instanceof h48) {
            this.w.R.i();
        }
    }
}
