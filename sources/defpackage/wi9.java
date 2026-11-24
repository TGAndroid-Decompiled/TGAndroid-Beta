package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class wi9 extends FrameLayout implements tjb, eib {
    public ti9 E;
    public boolean F;
    public boolean G;
    public od9 H;
    public String I;
    public int J;
    public n79 K;
    public Drawable L;
    public u20 M;
    public final RectF N;
    public boolean O;
    public int P;
    public yk Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final wjb a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final t8 d;
    public final si9 e;
    public final mc9 f;
    public final mc9 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public lk0 y;

    public wi9(Context context, wjb wjbVar) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.a0 = new Paint(1);
        this.a = wjbVar;
        setPadding(gl.L(16.0f), gl.L(5.0f), gl.L(16.0f), gl.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        t8 t8Var = new t8(this, context);
        this.d = t8Var;
        t8Var.setGravity(8388627);
        t8Var.setPaddingRelative(gl.L(6.0f), 0, 0, 0);
        t8Var.setSingleLine(true);
        t8Var.setIncludeFontPadding(false);
        t8Var.setTextSize(1, 16.0f);
        linearLayout.addView(t8Var, nme.o(18, -2));
        si9 si9Var = new si9(context, wjbVar);
        this.e = si9Var;
        si9Var.setVisibility(8);
        si9Var.setOnClickListener(new ni9(this, (byte) 0));
        linearLayout.addView(si9Var, nme.o(18, -2));
        mc9 mc9Var = new mc9(context, wjbVar);
        this.f = mc9Var;
        mc9Var.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        mc9Var.setListener(new qi9(this));
        mc9Var.setDelegate(new et3(this) {
            public final wi9 b;

            {
                this.b = this;
            }

            @Override
            public final void m() {
                byte b = r2;
                wi9 wi9Var = this.b;
                switch (b) {
                    case 0:
                        if (!wi9Var.T && wi9Var.y != null) {
                            wi9Var.K();
                            wi9.b(wi9Var.y.b, wi9Var.f.getText());
                            ti9 ti9Var = wi9Var.E;
                            if (ti9Var != null) {
                                ((ie9) ti9Var).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (wi9Var.y != null) {
                            wi9Var.v();
                            ti9 ti9Var2 = wi9Var.E;
                            if (ti9Var2 != null) {
                                ((ie9) ti9Var2).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        mc9Var.setOnFocusChangeListener(new ls0(this, (byte) 16));
        linearLayout.addView(mc9Var, nme.l(1.0f, 0, -2));
        addView(linearLayout, nme.e(-1, -2, 51));
        mc9 mc9Var2 = new mc9(context, wjbVar);
        this.h = mc9Var2;
        mc9Var2.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(1.0f));
        mc9Var2.setAllowNewlines(false);
        mc9Var2.setInputType(147457);
        mc9Var2.setListener(new ri9(this));
        mc9Var2.setDelegate(new et3(this) {
            public final wi9 b;

            {
                this.b = this;
            }

            @Override
            public final void m() {
                byte b = r2;
                wi9 wi9Var = this.b;
                switch (b) {
                    case 0:
                        if (!wi9Var.T && wi9Var.y != null) {
                            wi9Var.K();
                            wi9.b(wi9Var.y.b, wi9Var.f.getText());
                            ti9 ti9Var = wi9Var.E;
                            if (ti9Var != null) {
                                ((ie9) ti9Var).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (wi9Var.y != null) {
                            wi9Var.v();
                            ti9 ti9Var2 = wi9Var.E;
                            if (ti9Var2 != null) {
                                ((ie9) ti9Var2).a.W3();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        mc9Var2.setVisibility(8);
        addView(mc9Var2, nme.e(-1, -2, 51));
        I();
    }

    public static String E(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public static void b(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = yi9.f(charSequence);
    }

    public static void c(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    public static void g(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    private String getHint() {
        int i;
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                if (lk0Var.p) {
                    i = 2131754011;
                } else {
                    i = 2131754027;
                }
                return k96.M0(i, null);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                return k96.M0(2131754026, null);
            } else {
                if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                    return k96.M0(2131754025, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                    return k96.M0(2131754024, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                    return k96.M0(2131754023, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                    return k96.M0(2131754022, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    return k96.M0(2131754016, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    return k96.M0(2131754013, null);
                }
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return k96.M0(2131754013, null);
                }
                if (lk0Var.q) {
                    return k96.M0(2131754012, null);
                }
            }
        }
        return null;
    }

    public static TL_iv.RichText h(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean j(mc9 mc9Var, int i, int i2, int i3, int i4) {
        if (mc9Var.length() != 0 || i3 < i || i3 > mc9Var.getWidth() + i || i4 < i2 || i4 > mc9Var.getHeight() + i2) {
            return false;
        }
        return true;
    }

    public static boolean n(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (!lowerCase.equals("/img") && !lowerCase.equals("/pic") && !lowerCase.equals("/image") && !lowerCase.equals("/picture") && !lowerCase.equals("/photo")) {
            if (!lowerCase.equals("/vid") && !lowerCase.equals("/video")) {
                if (!lowerCase.equals("/audio") && !lowerCase.equals("/music")) {
                    if (!lowerCase.equals("/map") && !lowerCase.equals("/location") && !lowerCase.equals("/loc")) {
                        if (!lowerCase.equals("/latex") && !lowerCase.equals("/equation") && !lowerCase.equals("/math")) {
                            if (!lowerCase.equals("/toggle") && !lowerCase.equals("/details")) {
                                if (!lowerCase.equals("/button")) {
                                    return 0;
                                }
                                return 7;
                            }
                            return 6;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 5;
        }
        return 4;
    }

    public static vi9 q(lk0 lk0Var, String str) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str != null && lk0Var != null) {
            String trim = str.trim();
            int i3 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new vi9(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new vi9(u(charAt - '0'), lk0Var.c, lk0Var.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new vi9(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new vi9(pageblockpullquote, 0, 0);
                    } else if (lowerCase.equals("/table") || lowerCase.startsWith("/table ")) {
                        if (lowerCase.length() > 7) {
                            String trim2 = lowerCase.substring(7).trim();
                            int indexOf = trim2.indexOf(120);
                            if (indexOf < 0) {
                                indexOf = trim2.indexOf(88);
                            }
                            if (indexOf > 0) {
                                try {
                                    i2 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                                    try {
                                        i3 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    } catch (NumberFormatException unused) {
                                    }
                                } catch (NumberFormatException unused2) {
                                    i2 = 2;
                                }
                                i = i3;
                                i3 = i2;
                                return new vi9(t(i3, i), 0, 0);
                            }
                        }
                        i = 2;
                        return new vi9(t(i3, i), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new vi9(pageblockblockquote, 0, 0);
            }
            return new vi9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static vi9 r(lk0 lk0Var, String str) {
        int length;
        boolean z;
        char charAt;
        if (lk0Var != null && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                TL_iv.PageBlock pageBlock = lk0Var.b;
                boolean z2 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z = false;
                } else {
                    z = true;
                }
                if (str.charAt(0) == '#' && (z2 || z)) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        if (str.charAt(i3) == '#') {
                            i2++;
                        } else {
                            return null;
                        }
                    }
                    if (i2 >= 1 && i2 <= 6) {
                        return new vi9(u(i2), lk0Var.c, lk0Var.d);
                    }
                    return null;
                } else if (z2) {
                    if (lk0Var.c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new vi9(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            c(pageblockparagraph, "");
                            return new vi9(pageblockparagraph, 1, 0);
                        }
                    }
                    if (lk0Var.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return s(false);
                    }
                    if (lk0Var.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return s(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return s(true);
                        }
                    }
                    if (lk0Var.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        c(pageblockparagraph2, "");
                        return new vi9(pageblockparagraph2, 1, 1);
                    } else if (lk0Var.c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new vi9(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new vi9(new TL_iv.pageBlockPreformatted(), 0, 0);
                        }
                        return null;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static vi9 s(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c(pageblockparagraph, "");
        return new vi9(pageblockparagraph, 1, 0, true, z);
    }

    public static TL_iv.pageBlockTable t(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                pagetablerow.cells.add(ffb.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock u(int i) {
        switch (i) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean x(mc9 mc9Var, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = mc9Var.getLayout();
        if (layout != null && mc9Var.length() != 0) {
            int paddingLeft = i3 - (mc9Var.getPaddingLeft() + i);
            int paddingTop = i4 - (mc9Var.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = gl.L(24.0f);
                int max = Math.max(0, (mc9Var.getWidth() - mc9Var.getPaddingLeft()) - mc9Var.getPaddingRight());
                float f = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f);
                float f2 = paddingLeft;
                if (f2 >= max2 && f2 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String y(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return yi9.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return yi9.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f.O();
    }

    public final void B() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                od9 od9Var = new od9(this, (byte) 1);
                this.H = od9Var;
                postDelayed(od9Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (jj2 jj2Var : (jj2[]) text.getSpans(0, text.length(), jj2.class)) {
                text.removeSpan(jj2Var);
            }
        }
        this.I = null;
    }

    public final void C(ub9 ub9Var) {
        if (this.E != null && this.y != null && ub9Var != null) {
            List<String> list = ub9Var.c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int p = p(str);
                    if (p != 0) {
                        ((ie9) this.E).c(this.y, p);
                        return;
                    }
                    vi9 q = q(this.y, str);
                    if (q == null) {
                        q = r(this.y, tb4.o(str, " "));
                        continue;
                    }
                    if (q != null) {
                        ((ie9) this.E).d(this.y, q.a, q.b, q.c, q.d, q.e);
                        return;
                    }
                }
            }
        }
    }

    public final void D(Editable editable) {
        gm[] gmVarArr;
        lk0 lk0Var = this.y;
        if (lk0Var != null && ye9.y3(lk0Var.b) && ug8.A(editable)) {
            mc9 mc9Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = mc9Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((mc9Var.getTextSize() * 0.85f) / 1.2f));
            for (su3 su3Var : (su3[]) editable.getSpans(0, editable.length(), su3.class)) {
                su3Var.b = 0.85f;
            }
            for (gm gmVar : (gm[]) editable.getSpans(0, editable.length(), gm.class)) {
                gmVar.replaceFontMetrics(fontMetricsInt);
                gmVar.setSize(max);
            }
        }
    }

    public final void F() {
        ti9 ti9Var;
        int i;
        int i2;
        lk0 lk0Var = this.y;
        if (lk0Var != null && lk0Var.c > 0 && (ti9Var = this.E) != null) {
            int b = ((ie9) ti9Var).b(lk0Var);
            int a = ((ie9) this.E).a(this.y);
            lk0 lk0Var2 = this.y;
            if (lk0Var2.n) {
                if (lk0Var2.l <= 0) {
                    b = 0;
                } else {
                    b = gl.L(((i2 - 1) << 4) + 10);
                }
            }
            lk0 lk0Var3 = this.y;
            if (lk0Var3.o) {
                if (lk0Var3.m <= 0) {
                    a = 0;
                } else {
                    a = gl.L(((i - 1) << 4) + 10);
                }
            }
            if (b != getPaddingTop() || a != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b, getPaddingRight(), a);
            }
        }
    }

    public final void G() {
        lk0 lk0Var = this.y;
        mc9 mc9Var = this.f;
        mc9 mc9Var2 = this.h;
        if (lk0Var != null && n(lk0Var.b) && (mc9Var.length() > 0 || mc9Var2.length() > 0)) {
            if (mc9Var2.getVisibility() != 0) {
                mc9Var2.setVisibility(0);
                requestLayout();
            }
        } else if (mc9Var2.getVisibility() != 8) {
            if (mc9Var2.isFocused()) {
                mc9Var.requestFocus();
            }
            mc9Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i;
        Layout layout;
        int lineStart;
        mc9 mc9Var = this.f;
        if (mc9Var.getText() != null) {
            Editable text = mc9Var.getText();
            int i2 = -1;
            if (m() && ((TL_iv.pageBlockBlockquote) this.y.b).collapsed && (layout = mc9Var.getLayout()) != null && layout.getLineCount() > 3 && (lineStart = layout.getLineStart(3)) < (i = text.length())) {
                i2 = lineStart;
            } else {
                i = -1;
            }
            if (i2 == this.R && i == this.S) {
                return;
            }
            this.T = true;
            try {
                yk ykVar = this.Q;
                if (ykVar != null) {
                    text.removeSpan(ykVar);
                }
                if (i2 >= 0) {
                    yk ykVar2 = this.Q;
                    if (ykVar2 == null) {
                        ykVar2 = new yk(this, (byte) 2);
                        this.Q = ykVar2;
                    }
                    text.setSpan(ykVar2, i2, i, 33);
                }
                this.T = false;
                this.R = i2;
                this.S = i;
            } catch (Throwable th) {
                this.T = false;
                throw th;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        mc9 mc9Var = this.h;
        if (mc9Var != null) {
            mc9Var.updateColors();
        }
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.d.setTextColor(bkb.v0(i, wjbVar));
        if (this.L != null) {
            int v0 = bkb.v0(bkb.Ei, wjbVar);
            Drawable drawable = this.L;
            if (drawable != this.U || v0 != this.V) {
                this.U = drawable;
                this.V = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
        }
        n79 n79Var = this.K;
        if (n79Var != null) {
            rse.a(n79Var, wjbVar);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z) {
        float f;
        boolean z2 = pageBlock instanceof TL_iv.pageBlockPreformatted;
        LinearLayout linearLayout = this.s;
        if (!z2) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (linearLayout != null && z) {
            gl.B2(linearLayout);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.s = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = this.s;
            int i = bkb.h6;
            zkb.R(linearLayout3, bkb.Y(bkb.v0(i, this.a), gl.L(3.0f), gl.L(3.0f)), null, zkb.M(i), this.a);
            this.s.setPadding(gl.L(6.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
            addView(this.s, nme.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, nme.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(2131230873);
            this.s.addView(this.x, nme.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            jj8 jj8Var = qj2.a;
            synchronized (jj8Var.a) {
                if (!jj8Var.f) {
                    jj8Var.b.execute(new ej8(jj8Var, (byte) 1));
                }
            }
            this.s.setOnClickListener(new ni9(this, (byte) 1));
            this.s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i2 = bkb.F6;
        int v0 = bkb.v0(i2, this.a);
        float f2 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f = 0.5f;
        } else {
            f = 0.75f;
        }
        bkb.p1(f, v0);
        if (TextUtils.isEmpty(str)) {
            f2 = 0.5f;
        }
        vkb K = zkb.K(f2, i2);
        ImageView imageView2 = this.x;
        wjb wjbVar = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = K.a;
        float f3 = K.d;
        int P = zkb.P(i3, -1, 2, f3, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        zkb.N(imageView2, 5, i3, -1, 2, f3, wjbVar, P, porterDuffColorFilter).h = mode;
        zkb.Y(this.w, K, this.a);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.w;
        if (isEmpty) {
            textView2.setText(k96.M0(2131754014, null));
        } else {
            textView2.setText(h27.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        lk0 lk0Var = this.y;
        boolean z = false;
        if (lk0Var != null && lk0Var.d > 0) {
            mc9 mc9Var = this.f;
            if (mc9Var.length() > 0 && (mc9Var.c(0, 1) & 1) != 0) {
                z = true;
            }
        }
        if (z) {
            typeface = gl.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        lk0 lk0Var2 = this.y;
        if (lk0Var2 != null && lk0Var2.d > 0) {
            a(lk0Var2);
        }
    }

    public final void a(lk0 lk0Var) {
        int i;
        int e;
        int i2;
        lk0 lk0Var2;
        int i3;
        String l;
        int i4 = lk0Var.c;
        si9 si9Var = this.e;
        t8 t8Var = this.d;
        View view = this.c;
        if (i4 <= 0) {
            view.setVisibility(8);
            t8Var.setVisibility(8);
            si9Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = gl.L(24.0f) * (i4 - 1);
        view.setLayoutParams(layoutParams);
        if (i4 > 1) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (lk0Var.e) {
            t8Var.setVisibility(8);
            si9Var.setVisibility(0);
            ((CheckBoxBase) si9Var.b).f(-1, lk0Var.f, false);
            return;
        }
        si9Var.setVisibility(8);
        t8Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t8Var.getLayoutParams();
        if (lk0Var.d == 0) {
            e = gl.L(18.0f);
        } else {
            ti9 ti9Var = this.E;
            if (ti9Var != null) {
                TextPaint paint = t8Var.getPaint();
                ArrayList arrayList = ((ie9) ti9Var).a.t3;
                int indexOf = arrayList.indexOf(lk0Var);
                if (indexOf >= 0 && (i2 = lk0Var.c) > 0 && lk0Var.d > 0) {
                    int i5 = indexOf;
                    while (i5 > 0) {
                        lk0 lk0Var3 = (lk0) arrayList.get(i5 - 1);
                        int i6 = lk0Var3.c;
                        if (i6 < i2 || (i6 == i2 && lk0Var3.d <= 0)) {
                            break;
                        }
                        i5--;
                    }
                    int i7 = indexOf + 1;
                    while (i7 < arrayList.size() && (i3 = (lk0Var2 = (lk0) arrayList.get(i7)).c) >= i2 && (i3 != i2 || lk0Var2.d > 0)) {
                        i7++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(gl.o());
                    float f = 0.0f;
                    while (i5 < i7) {
                        lk0 lk0Var4 = (lk0) arrayList.get(i5);
                        if (lk0Var4.c == i2 && lk0Var4.d > 0) {
                            f = Math.max(f, paint2.measureText(lk0Var4.d + "."));
                        }
                        i5++;
                    }
                    e = ls6.e(10.0f, (int) Math.ceil(f), gl.L(28.0f));
                } else {
                    e = ls6.e(10.0f, (int) Math.ceil(paint.measureText(de9.l(new StringBuilder(), lk0Var.d, "."))), gl.L(28.0f));
                }
            } else {
                int L = gl.L(28.0f);
                TextPaint paint3 = t8Var.getPaint();
                e = ls6.e(10.0f, (int) Math.ceil(paint3.measureText(lk0Var.d + ".")), L);
            }
        }
        if (layoutParams2.width != e) {
            layoutParams2.width = e;
            t8Var.setLayoutParams(layoutParams2);
        }
        if (lk0Var.d == 0) {
            l = "";
        } else {
            l = de9.l(new StringBuilder(), lk0Var.d, ".");
        }
        t8Var.setText(l);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    public final void d(defpackage.lk0 r27, defpackage.ti9 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi9.d(lk0, ti9, boolean):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i() && this.M != null) {
            boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.O) {
                            this.O = false;
                            this.M.f(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.f(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.f(false);
                    if (contains && m()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        ti9 ti9Var = this.E;
                        if (ti9Var != null) {
                            ye9 ye9Var = ((ie9) ti9Var).a;
                            ld9 ld9Var = ye9Var.R3;
                            if (ld9Var != null) {
                                ld9Var.g();
                            }
                            ye9Var.p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.f(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i, int i2) {
        Layout layout;
        u20 u20Var;
        int L;
        boolean z;
        if (i()) {
            mc9 mc9Var = this.h;
            if (mc9Var.getVisibility() == 0 && (layout = mc9Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new u20(this);
                }
                boolean z2 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + mc9Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + mc9Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + mc9Var.getPaddingTop() + measuredHeight;
                int L2 = gl.L(3.333f);
                this.M.getClass();
                float x = ls6.x(16.0f, i, L2) - ((gl.L(23.66f) + u20Var.b) + (gl.L(3.333f) << 1));
                this.M.getClass();
                int i3 = i2 - L2;
                float L3 = i3 - gl.L(17.66f);
                float f = i3;
                if (lineRight > x) {
                    z = true;
                } else {
                    z = false;
                }
                if (lineBottom <= L3 || lineTop >= f) {
                    z2 = false;
                }
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + gl.L(4.0f)) + L) + L2) - i2));
                }
            }
        }
        return 0;
    }

    public final void f() {
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            g(lk0Var.b);
        }
        mc9 mc9Var = this.h;
        if (mc9Var.getVisibility() != 0) {
            mc9Var.setVisibility(0);
            requestLayout();
        }
        mc9Var.O();
        mc9Var.setSelection(mc9Var.length());
    }

    public mc9 getAuthorEditText() {
        return this.h;
    }

    public mc9 getEditText() {
        return this.f;
    }

    public lk0 getRow() {
        return this.y;
    }

    public fk4 getStyleDelegate() {
        return this.f;
    }

    public final boolean i() {
        Layout layout;
        if (!m() || (layout = this.f.getLayout()) == null || layout.getLineCount() <= 3) {
            return false;
        }
        return true;
    }

    @Override
    public final void k(ArrayList arrayList) {
        Layout layout;
        mc9 mc9Var = this.f;
        Layout layout2 = mc9Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new xh9(layout2, mc9Var.getPaddingLeft() + mc9Var.getLeft() + linearLayout.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop() + linearLayout.getTop(), (byte) 1));
        }
        mc9 mc9Var2 = this.h;
        if (mc9Var2.getVisibility() == 0 && (layout = mc9Var2.getLayout()) != null) {
            arrayList.add(new xh9(layout, mc9Var2.getPaddingLeft() + mc9Var2.getLeft(), mc9Var2.getPaddingTop() + mc9Var2.getTop(), (byte) 2));
        }
    }

    public final boolean l() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        lk0 lk0Var = this.y;
        if (lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    public final void o(boolean z) {
        ti9 ti9Var;
        this.f.setHint(getHint());
        if (!z && (ti9Var = this.E) != null) {
            ((ie9) ti9Var).a.p3.b(this, null);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H();
        mc9 mc9Var = this.h;
        if (mc9Var.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        mc9Var.layout(paddingLeft, measuredHeight, mc9Var.getMeasuredWidth() + paddingLeft, mc9Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        F();
        int size = View.MeasureSpec.getSize(i);
        mc9 mc9Var = this.h;
        if (mc9Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, 0);
        mc9Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), 0);
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + mc9Var.getMeasuredHeight() + measuredHeight;
        int e = e(size, paddingBottom);
        this.P = e;
        setMeasuredDimension(size, paddingBottom + e);
    }

    public void setLocked(boolean z) {
        this.f.setLocked(z);
        this.h.setLocked(z);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof ed9) {
                ((ed9) getBackground()).a(bkb.v0(bkb.c6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v() {
        lk0 lk0Var = this.y;
        if (lk0Var != null && n(lk0Var.b)) {
            TL_iv.PageBlock pageBlock = this.y.b;
            TL_iv.RichText f = yi9.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            u20 u20Var = this.M;
            if (u20Var != null) {
                if (drawable != ((gn) u20Var.e) && drawable != ((by8) u20Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            b(lk0Var.b, this.f.getText());
        }
    }
}
