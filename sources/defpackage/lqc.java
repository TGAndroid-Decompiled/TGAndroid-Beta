package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Wallet.WalletEngine2;
public final class lqc extends FrameLayout {
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final c25 I;
    public final bd J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final TextView[] O;
    public final EditText a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final wjb e;
    public Runnable f;
    public Runnable h;
    public Runnable n;
    public Runnable r;
    public PopupWindow s;
    public boolean w;
    public LinearLayout x;
    public ImageView y;

    public lqc(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        float f;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.I = new c25(this, (byte) 4);
        this.J = new bd(this, (byte) 4);
        this.O = new TextView[3];
        this.e = wjbVar;
        int L = gl.L(16.0f);
        int i2 = bkb.Z6;
        Drawable b0 = bkb.b0(L, bkb.p1(0.5f, bkb.v0(i2, wjbVar)));
        vkb K = zkb.K(0.5f, i2);
        setBackground(b0);
        zkb.j(this, b0, K, null, wjbVar);
        setPadding(gl.L(20.0f), 0, gl.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i + 1) + ".");
        zkb.X(textView, bkb.z6, wjbVar);
        addView(textView, nme.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, gl.L(15.0f), 0, gl.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        zkb.D(editText, bkb.y6, wjbVar);
        zkb.X(editText, bkb.F6, wjbVar);
        editText.setHint("");
        editText.setOnFocusChangeListener(new ls0(this, (byte) 20));
        editText.addTextChangedListener(new jf6(this, (byte) 27));
        if (z) {
            f = 64.0f;
        } else {
            f = 8.0f;
        }
        addView(editText, nme.d(-1, -1.0f, 16, 30.0f, 0.0f, f, 0.0f));
        editText.setOnEditorActionListener(new kpc(this, (byte) 1));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, nme.e(-2, -2, 21));
        if (z) {
            TextView textView2 = new TextView(context);
            this.c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(gl.o());
            textView2.setGravity(17);
            ug8.x(textView2, bkb.p6, wjbVar, null, 2131742792);
            textView2.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(6.0f));
            int L2 = gl.L(28.0f);
            int i3 = bkb.c6;
            ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i3, wjbVar));
            vkb M = zkb.M(i3);
            textView2.setBackground(b02);
            zkb.j(textView2, b02, M, null, wjbVar);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final lqc b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    byte b = r2;
                    lqc lqcVar = this.b;
                    switch (b) {
                        case 0:
                            EditText editText2 = lqcVar.a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) lqcVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = lqcVar.h;
                                    if (runnable != null) {
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            EditText editText3 = lqcVar.a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, nme.e(-2, -2, 17));
        } else {
            this.c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.x6, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(2131231244);
        int i4 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 3, -1);
        vkb M2 = zkb.M(i4);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M2, wjbVar);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final lqc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                byte b = r2;
                lqc lqcVar = this.b;
                switch (b) {
                    case 0:
                        EditText editText2 = lqcVar.a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) lqcVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = lqcVar.h;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        EditText editText3 = lqcVar.a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, nme.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.a.getText().toString().trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return true;
        }
        for (String str : WalletEngine2.getMnemonicWordlist()) {
            if (str.equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        int i;
        int height;
        float f;
        Rect rect = this.E;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.G;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.H;
        getLocationInWindow(iArr2);
        Rect rect2 = this.F;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(260.0f), rect.width()), Integer.MIN_VALUE), 0);
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = gl.L(9.0f);
        if (getHeight() + iArr[1] + L + measuredHeight > rect.bottom) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.y) != i) {
            linearLayout.removeView(this.y);
            linearLayout.addView(this.y, i);
            ImageView imageView = this.y;
            if (i != 0) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            imageView.setRotation(f);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i != 0) {
            height = (iArr[1] - L) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + L;
        }
        int i2 = (max + iArr2[0]) - iArr[0];
        int i3 = (height + iArr2[1]) - iArr[1];
        if (this.s.isShowing()) {
            if (this.K != i2 || this.L != i3 || this.M != measuredWidth || this.N != measuredHeight) {
                this.s.update(i2, i3, measuredWidth, measuredHeight);
            }
        } else {
            this.s.setWidth(measuredWidth);
            this.s.setHeight(measuredHeight);
            this.s.showAtLocation(this, 51, i2, i3);
            getViewTreeObserver().addOnGlobalLayoutListener(this.I);
            getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
        this.K = i2;
        this.L = i3;
        this.M = measuredWidth;
        this.N = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqc.d():void");
    }

    public final void e() {
        boolean z;
        int i;
        if (!this.w && this.a.getText().length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.w) {
            i = bkb.p7;
        } else if (z) {
            i = bkb.F6;
        } else {
            i = bkb.z6;
        }
        zkb.X(this.b, i, this.e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i;
        if (this.a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : WalletEngine2.getMnemonicWordlist()) {
                if (str2.startsWith(str) && !str2.equals(str)) {
                    arrayList.add(str2);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                a();
                return;
            }
            Context context = getContext();
            PopupWindow popupWindow = this.s;
            TextView[] textViewArr = this.O;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.s.setFocusable(false);
                this.s.setInputMethodMode(1);
                this.s.setBackgroundDrawable(null);
                this.s.setElevation(gl.L(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.y.setImageResource(2131232846);
                linearLayout.addView(this.y, nme.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.x = linearLayout2;
                linearLayout2.setOrientation(0);
                this.x.setGravity(16);
                this.x.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
                this.x.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(gl.L(8.0f));
                this.x.setBackground(gradientDrawable);
                for (int i2 = 0; i2 < 3; i2++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(gl.n1("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(gl.L(140.0f));
                    textView.setPadding(gl.L(14.0f), gl.L(9.0f), gl.L(14.0f), gl.L(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new v0(this, i2, (byte) 27));
                    textViewArr[i2] = textView;
                    LinearLayout linearLayout3 = this.x;
                    if (i2 == 0) {
                        i = 0;
                    } else {
                        i = 12;
                    }
                    linearLayout3.addView(textView, nme.t(-2, -2, 16, i, 0, 0, 0));
                }
                linearLayout.addView(this.x, nme.o(-2, -2));
                this.s.setContentView(linearLayout);
                this.s.setWidth(-2);
                this.s.setHeight(-2);
                this.s.setOnDismissListener(new x6(this, (byte) 7));
            }
            for (int i3 = 0; i3 < 3; i3++) {
                TextView textView2 = textViewArr[i3];
                if (i3 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i3);
                    SpannableString spannableString = new SpannableString(str3);
                    int min = Math.min(str.length(), str3.length());
                    spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                    textView2.setText(spannableString);
                    if (i3 == 0) {
                        shapeDrawable = bkb.b0(gl.L(5.0f), 452984831);
                    } else {
                        shapeDrawable = null;
                    }
                    textView2.setBackground(shapeDrawable);
                    textView2.setVisibility(0);
                } else {
                    textView2.setText("");
                    textView2.setBackground(null);
                    textView2.setVisibility(8);
                }
            }
            c();
            return;
        }
        a();
    }

    public String getWord() {
        return this.a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(256.0f), View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), i2);
    }

    public void setError(boolean z) {
        if (this.w != z) {
            this.w = z;
            ImageView imageView = this.d;
            EditText editText = this.a;
            wjb wjbVar = this.e;
            if (z) {
                int L = gl.L(16.0f);
                int i = bkb.q7;
                ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.24f, bkb.v0(i, wjbVar)));
                vkb K = zkb.K(0.24f, i);
                setBackground(b0);
                zkb.j(this, b0, K, null, wjbVar);
                int i2 = bkb.p7;
                zkb.X(this.b, i2, wjbVar);
                zkb.X(editText, i2, wjbVar);
                if (imageView != null) {
                    zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
                }
                gl.C3(this);
            } else {
                int L2 = gl.L(16.0f);
                int i3 = bkb.Z6;
                ShapeDrawable b02 = bkb.b0(L2, bkb.p1(0.5f, bkb.v0(i3, wjbVar)));
                vkb K2 = zkb.K(0.5f, i3);
                setBackground(b02);
                zkb.j(this, b02, K2, null, wjbVar);
                zkb.X(editText, bkb.F6, wjbVar);
                if (imageView != null) {
                    zkb.s(imageView, bkb.x6, wjbVar, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
