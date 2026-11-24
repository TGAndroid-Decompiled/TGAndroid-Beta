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
public final class p62 extends z49 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final ChatAttachAlertPhotoLayout w;

    public p62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final boolean E(r59 r59Var) {
        yn6 yn6Var;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if ((!isEmpty || ((yn6Var = chatAttachAlertPhotoLayout.U0) != null && !yn6Var.e.isEmpty())) && chatAttachAlertPhotoLayout.b.L1 && b() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        jo6 M = M(i);
        if (M == null) {
            int i2 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i <= i2) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
                if (!arrayList.isEmpty()) {
                    M = (jo6) arrayList.get(0);
                } else {
                    yn6 yn6Var = chatAttachAlertPhotoLayout.U0;
                    if (yn6Var != null) {
                        M = (jo6) yn6Var.e.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (jo6) b10.f(1, chatAttachAlertPhotoLayout.U0.e);
            }
        }
        if (M != null) {
            long j = M.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return jb6.e0(j, true);
        }
        return "";
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b() / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (r59Var.getMeasuredHeight() - currentActionBarHeight)) * f;
        float f2 = measuredHeight;
        iArr[0] = ((int) (ceil / f2)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = r59Var.getPaddingTop() + ((int) (ceil % f2)) + ((int) ((1.0f - f) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(r59 r59Var) {
        byte b = this.w.N0;
        int ceil = (int) Math.ceil(this.n / b);
        if (r59Var.getChildCount() != 0) {
            int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
            View childAt = r59Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.i((((R / b) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (r59Var.getMeasuredHeight() - a.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(r59 r59Var) {
        this.s = false;
        int childCount = r59Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            r59Var.getChildAt(i).invalidate();
        }
    }

    @Override
    public final void K() {
        this.s = true;
    }

    public final b59 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        q68 q68Var = new q68(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            q68Var.setOutlineProvider(new cm0(this, (byte) 5));
            q68Var.setClipToOutline(true);
        }
        q68Var.setFastScrollDelegate(new cd1(this, (byte) 19));
        q68Var.setDelegate(new g11(this, q68Var, (byte) 25));
        return new u69(q68Var);
    }

    public final jo6 M(int i) {
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
        p62 p62Var = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z = chatAttachAlertPhotoLayout.Q0;
        if (z && this == p62Var) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i++;
        }
        if (z && this == p62Var) {
            i++;
        }
        this.r = i;
        if (!z) {
            i += ChatAttachAlertPhotoLayout.s1.size();
            yn6 yn6Var = chatAttachAlertPhotoLayout.U0;
            if (yn6Var != null) {
                i += yn6Var.e.size();
            }
        }
        if (this.e && i > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i++;
        }
        if (this == p62Var) {
            i++;
        }
        this.n = i;
        return i;
    }

    @Override
    public final int d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p62.d(int):int");
    }

    @Override
    public final void f() {
        int i;
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            r34 r34Var = chatAttachAlertPhotoLayout.I;
            if ((b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) || !chatAttachAlertPhotoLayout.w0) {
                i = 0;
            } else {
                i = 4;
            }
            r34Var.setVisibility(i);
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z6 = this.d;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 == 7) {
                        ((gt4) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                        return;
                    }
                    return;
                }
                l68 l68Var = (l68) view;
                l68Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                if (!z6 || !chatAttachAlertPhotoLayout.P0 || i != 0) {
                    i3 = 1;
                }
                l68Var.setType(i3);
                return;
            }
            ((k68) view).setItemSize(chatAttachAlertPhotoLayout.L0);
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
        q68 q68Var = (q68) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            q68Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            if (chatAttachAlertPhotoLayout.s.o) {
                z = true;
            } else {
                z = false;
            }
            q68Var.setIsVertical(z);
        }
        if (i22Var.N2 == 0 && !i22Var.Q2 && !i22Var.B1) {
            q68Var.getCheckBox().setVisibility(0);
        } else {
            q68Var.getCheckBox().setVisibility(8);
        }
        jo6 d0 = chatAttachAlertPhotoLayout.d0(i);
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
        if (i22Var != null && i22Var.c2) {
            z5 = true;
        } else {
            z5 = false;
        }
        q68Var.d(d0, z2, z3, z4, z5);
        if ((i22Var.Z1 instanceof yv1) && i22Var.Q3) {
            q68Var.b(ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(i4)), hashMap.containsKey(Integer.valueOf(i4)), false);
        } else {
            q68Var.b(-1, hashMap.containsKey(Integer.valueOf(i4)), false);
        }
        if (!chatAttachAlertPhotoLayout.x0 && d0.b) {
            q68Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.y0 && !d0.b) {
            q68Var.setAlpha(0.3f);
        } else {
            q68Var.setAlpha(1.0f);
        }
        q68Var.getImageView().setTag(Integer.valueOf(i));
        q68Var.setTag(Integer.valueOf(i));
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        ylb ylbVar = chatAttachAlertPhotoLayout.a;
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
                                    int i2 = cmb.Z9;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    anb.s(imageView, i2, ylbVar, mode);
                                    frameLayout.addView(imageView, qoe.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    anb.s(imageView2, cmb.aa, ylbVar, mode);
                                    frameLayout.addView(imageView2, qoe.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.c = textView;
                                    anb.X(textView, cmb.ba, ylbVar);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, qoe.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = gm.L(80.0f);
                                    return new u69(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new g69(-1, gm.L(56.0f)));
                                b61 b61Var = new b61(ylbVar, context, true);
                                b61Var.setUseWrapContent(true);
                                b61Var.f();
                                b61Var.setPadding(gm.L(28.0f), 0, gm.L(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new pn2(2131230928, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131750414, null));
                                b61Var.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(b61Var, qoe.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new u69(frameLayout2);
                            }
                            gt4 gt4Var = new gt4(context, i22Var.G3);
                            gt4Var.setLayoutParams(new g69(-1, gm.L(400.0f)));
                            gt4Var.setGravity(17);
                            gt4Var.isClickable();
                            gt4Var.b.setOnClickListener(new sf3(new u52(chatAttachAlertPhotoLayout, (byte) 5), (byte) 22));
                            gt4Var.a.setOnClickListener(new sf3(new u52(chatAttachAlertPhotoLayout, (byte) 6), (byte) 23));
                            gt4Var.c.setOnClickListener(new tf3(gt4Var, new mf2(this, (byte) 18), (byte) 15));
                            return new u69(gt4Var);
                        }
                        return new u69(new View(context));
                    }
                    i22Var.getClass();
                    return new u69(new o62(this, context));
                }
                return new u69(new sb((byte) 5, context, this));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.a = gm.L(0.0f);
            return new u69(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            b59 b59Var = (b59) arrayList.get(0);
            arrayList.remove(0);
            return b59Var;
        }
        return L();
    }

    @Override
    public final void y(u69 u69Var) {
        if (u69Var.a instanceof k68) {
            this.w.R.i();
        }
    }
}
