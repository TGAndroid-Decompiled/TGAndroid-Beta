package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l98 extends e implements fn7 {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final do6 K;
    public d79 L;
    public t20 M;
    public h98 N;
    public z2b O;
    public rl2 P;
    public s7 Q;
    public b8 R;
    public int S;
    public boolean T;
    public final byte U;
    public final zu1 V;
    public j89 W;
    public byte X;
    public boolean Y;
    public boolean Z;
    public final boolean a;
    public FrameLayout a0;
    public final HashMap b;
    public d26 b0;
    public final ArrayList c;
    public tb c0;
    public Editable d;
    public View d0;
    public boolean e;
    public iu3 e0;
    public final ArrayList f;
    public ImageView f0;
    public g98 g0;
    public final HashMap h;
    public byte h0;
    public final TextPaint i0;
    public final RectF j0;
    public final Paint k0;
    public AnimatorSet l0;
    public boolean m0;
    public final ArrayList n;
    public n8 n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public b8[] p0;
    public String q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public final boolean s0;
    public j98 t0;
    public k98 u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final int x0;
    public int y;
    public final f98 y0;

    public l98(int i, do6 do6Var, HashMap hashMap, ArrayList arrayList, int i2, boolean z, zu1 zu1Var, boolean z2) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.J = true;
        this.S = 100;
        this.h0 = (byte) 3;
        this.i0 = new TextPaint(1);
        this.j0 = new RectF();
        this.k0 = new Paint(1);
        this.r0 = true;
        this.y0 = new f98(this);
        this.K = do6Var;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i;
        this.U = i2;
        this.V = zu1Var;
        this.F = z;
        this.s0 = z2;
        if (do6Var == null) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("web_recent_search", 0);
            int i3 = sharedPreferences.getInt("count", 0);
            for (int i4 = 0; i4 < i3; i4++) {
                String string = sharedPreferences.getString("recent" + i4, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z2) {
            this.v0 = aob.lh;
            this.w0 = aob.Yg;
            this.x0 = aob.Zg;
            return;
        }
        this.v0 = aob.h5;
        this.w0 = aob.j5;
        this.x0 = aob.I5;
    }

    public final int a0(int i, Object obj) {
        Object obj2;
        boolean z = obj instanceof no6;
        if (z) {
            obj2 = Integer.valueOf(((no6) obj).C);
        } else if (obj instanceof ro6) {
            obj2 = ((ro6) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.e) {
                l0();
            }
            if (i >= 0) {
                if (z) {
                    ((no6) obj).e();
                } else if (obj instanceof ro6) {
                    ((ro6) obj).e();
                }
                this.y0.X(i);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.da));
    }

    public final void b0() {
        this.n.clear();
        t20 t20Var = this.M;
        if (t20Var != null) {
            t20Var.f();
        }
        this.O.e(false, true);
        g0();
    }

    public final d88 c0(int i) {
        int childCount = this.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.L.getChildAt(i2);
            if (childAt instanceof d88) {
                d88 d88Var = (d88) childAt;
                int intValue = ((Integer) d88Var.getTag()).intValue();
                do6 do6Var = this.K;
                if (do6Var == null ? !(intValue < 0 || intValue >= this.f.size()) : !(intValue < 0 || intValue >= do6Var.e.size())) {
                    if (intValue == i) {
                        return d88Var;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        this.Z = false;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i = this.v0;
        yob.h(i, null, aVar);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        int i2 = this.w0;
        yob.l(aVar2, 5, i2, null);
        yob.l(this.actionBar, 1, i2, null);
        yob.l(this.actionBar, 3, this.x0, null);
        this.actionBar.setBackButtonImage(2131231243);
        boolean z2 = this.a;
        do6 do6Var = this.K;
        if (do6Var != null) {
            this.actionBar.setTitle(do6Var.c);
        } else if (!z2) {
            this.actionBar.setTitle(ob6.M0(2131745489, null));
        } else if (z2) {
            this.actionBar.setTitle(ob6.M0(2131745492, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 21));
        if (this.m0) {
            s7 a = this.actionBar.u().a(0, 2131231247);
            a.setSubMenuDelegate(new kj4(this, (byte) 25));
            this.R = a.e(1, 2131232213, ob6.M0(2131745073, null));
            a.e(2, 2131232270, ob6.M0(2131747523, null));
        }
        if (do6Var == null) {
            s7 a2 = this.actionBar.u().a(0, 2131232502);
            a2.N();
            a2.I = new cm0(this);
            this.Q = a2;
            EditTextBoldCursor searchField = a2.getSearchField();
            yob.X(searchField, i2, null);
            yob.v(searchField, i2, null);
            yob.D(searchField, aob.Me, null);
            if (!z2) {
                this.Q.setSearchFieldHint(ob6.M0(2131745489, null));
            } else if (z2) {
                this.Q.setSearchFieldHint(ob6.M0(2131745492, null));
            }
        }
        g98 g98Var = new g98(this, context);
        this.g0 = g98Var;
        yob.h(i, null, g98Var);
        this.fragmentView = this.g0;
        d79 d79Var = new d79(context, null);
        this.L = d79Var;
        d79Var.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        d79 d79Var2 = this.L;
        ?? u55Var = new u55(4);
        this.N = u55Var;
        d79Var2.setLayoutManager(u55Var);
        this.N.O = new ar1(this, (byte) 12);
        this.g0.addView(this.L, tre.e(-1, -1, 51));
        d79 d79Var3 = this.L;
        t20 t20Var = new t20(this, context, (byte) 12);
        this.M = t20Var;
        d79Var3.setAdapter(t20Var);
        yob.H(this.L, i, null);
        this.L.setOnItemClickListener(new zg4(this, (byte) 18));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new d98(this, (byte) 3));
        }
        j89 j89Var = new j89(new xh4(this, (byte) 22));
        this.W = j89Var;
        if (this.I != 1) {
            this.L.F.add(j89Var);
        }
        rl2 rl2Var = new rl2(context, getResourceProvider(), (byte) 3);
        this.P = rl2Var;
        rl2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        z2b z2bVar = new z2b(context, this.P, 1, getResourceProvider());
        this.O = z2bVar;
        z2bVar.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        yob.X(this.O.d, aob.y6, getResourceProvider());
        this.O.addView(this.P, 0);
        z2b z2bVar2 = this.O;
        if (do6Var != null) {
            z2bVar2.d.setText(ob6.M0(2131747911, null));
        } else {
            z2bVar2.d.setText(ob6.M0(2131747900, null));
        }
        this.O.e(false, false);
        this.g0.addView(this.O, tre.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new e98(this, (byte) 0));
        if (do6Var == null) {
            n0();
        }
        if (this.r0) {
            View view = new View(context);
            this.d0 = view;
            view.setBackgroundResource(2131231241);
            this.d0.setTranslationY(hl.L(48.0f));
            this.g0.addView(this.d0, tre.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.a0 = frameLayout;
            yob.h(i, null, frameLayout);
            this.a0.setVisibility(4);
            this.a0.setTranslationY(hl.L(48.0f));
            this.g0.addView(this.a0, tre.e(-1, 48, 83));
            this.a0.setOnTouchListener(new b02((byte) 20));
            iu3 iu3Var = this.e0;
            if (iu3Var != null) {
                iu3Var.o();
            }
            this.e0 = new iu3(context, this.g0, null, 1, false, null);
            this.e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(uc7.s1(yac.t0).H0())});
            this.e0.setHint(ob6.M0(2131754447, null));
            this.e0.s();
            xt3 editText = this.e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.a0.addView(this.e0, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            Editable editable = this.d;
            if (editable != null) {
                this.e0.setText(editable);
            }
            this.e0.getEditText().addTextChangedListener(new nh6(this, (byte) 6));
            d26 d26Var = new d26((byte) 9, context, this);
            this.b0 = d26Var;
            d26Var.setFocusable(true);
            this.b0.setFocusableInTouchMode(true);
            this.b0.setVisibility(4);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.b0.setAlpha(0.0f);
            this.g0.addView(this.b0, tre.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f0 = new ImageView(context);
            this.f0.setBackgroundDrawable(aob.h0(hl.L(56.0f), aob.w0(null, aob.S5, false), aob.w0(null, aob.T5, false)));
            this.f0.setImageResource(2131230876);
            this.f0.setImportantForAccessibility(2);
            yob.s(this.f0, aob.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f0.setOutlineProvider(new yi((byte) 9));
            this.b0.addView(this.f0, tre.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f0.setOnClickListener(new am7(this, (byte) 14));
            this.f0.setOnLongClickListener(new zs(this, (byte) 9));
            TextPaint textPaint = this.i0;
            textPaint.setTextSize(hl.L(12.0f));
            textPaint.setTypeface(hl.o());
            tb tbVar = new tb((byte) 25, context, this);
            this.c0 = tbVar;
            tbVar.setAlpha(0.0f);
            this.c0.setScaleX(0.2f);
            this.c0.setScaleY(0.2f);
            this.g0.addView(this.c0, tre.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.e0.setVisibility(8);
            }
        }
        if ((do6Var != null || !z2 || z2) && this.J) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.L.setEmptyView(this.O);
        d79 d79Var4 = this.L;
        d79Var4.X1 = true;
        d79Var4.Y1 = false;
        m0(0);
        return this.fragmentView;
    }

    public final void d0(TLObject tLObject, boolean z) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        uc7.s1(this.currentAccount).j4(tL_contacts_resolvedPeer.users, false);
        uc7.s1(this.currentAccount).c4(tL_contacts_resolvedPeer.chats, false);
        jf7.Y(this.currentAccount).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.H;
        this.H = null;
        h0(str, "", z, false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.s) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(View view, Object obj) {
        boolean z;
        int i = 1;
        if (a0(-1, obj) == -1) {
            z = true;
        } else {
            z = false;
        }
        if (view instanceof zea) {
            ((zea) view).b(this.c.contains(Integer.valueOf(((no6) this.K.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z) {
            i = 2;
        }
        m0(i);
        this.t0.h();
    }

    public final void f0(EditTextBoldCursor editTextBoldCursor) {
        boolean z;
        if (editTextBoldCursor.getText().length() == 0) {
            return;
        }
        String obj = editTextBoldCursor.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        if (this.a) {
            z = true;
        } else {
            z = false;
        }
        h0(obj, "", z, true);
        this.w = obj;
        if (obj.length() == 0) {
            this.w = null;
            this.O.d.setText(ob6.M0(2131747900, null));
        } else {
            this.O.d.setText(ob6.a0("NoResultFoundFor", null, 2131747897, this.w));
        }
        n0();
    }

    public final void g0() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            edit.putString(uh9.k(i, "recent"), (String) this.n.get(i));
        }
        edit.commit();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.v0));
        arrayList.add(new apb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.v0));
        arrayList.add(new apb(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        arrayList.add(new apb(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        arrayList.add(new apb(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.x0));
        arrayList.add(new apb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        s7 s7Var = this.Q;
        if (s7Var != null) {
            editTextBoldCursor = s7Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new apb(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        arrayList.add(new apb(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.v0));
        arrayList.add(new apb(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.X9));
        return arrayList;
    }

    public final void h0(String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        String str5;
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.H = str;
        this.r = true;
        uc7 s1 = uc7.s1(this.currentAccount);
        uc7 s12 = uc7.s1(this.currentAccount);
        if (z) {
            str3 = s12.o3;
        } else {
            str3 = s12.p3;
        }
        TLObject c2 = s1.c2(str3);
        if (!(c2 instanceof TLRPC.User)) {
            if (z2 && !this.G) {
                this.G = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                uc7 s13 = uc7.s1(this.currentAccount);
                if (z) {
                    str5 = s13.o3;
                } else {
                    str5 = s13.p3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new q81((byte) 10, this, z));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) c2;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = uc7.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        zu1 zu1Var = this.V;
        if (zu1Var != null) {
            long a = zu1Var.a();
            if (wf3.B(a)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().j1(a);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i = this.E + 1;
        this.E = i;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new qa7(this, str, i, z, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    public final void i0(int i, boolean z) {
        HashMap hashMap = this.b;
        if (!hashMap.isEmpty() && this.t0 != null && !this.T) {
            iu3 iu3Var = this.e0;
            if (iu3Var != null && iu3Var.a.length() > 0) {
                Object obj = hashMap.get(this.c.get(0));
                if (obj instanceof no6) {
                    ((no6) obj).a = this.e0.getText().toString();
                } else if (obj instanceof ro6) {
                    ((ro6) obj).I = this.e0.getText().toString();
                }
            }
            this.T = true;
            this.t0.C(i, false, z);
            if (this.U != 2) {
                j98 j98Var = this.t0;
                if (j98Var == null || j98Var.f()) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (hl.B(aob.w0(null, aob.a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0(int i, boolean z) {
        this.I = i;
        this.J = z;
        if (i > 0 && this.a) {
            this.I = 1;
        }
    }

    public final boolean k0(boolean z, boolean z2) {
        boolean z3;
        Integer num;
        float f;
        float f2;
        float f3;
        float f4;
        float L;
        float f5;
        float f6;
        float f7;
        float f8;
        float L2;
        if (this.e0 != null) {
            if (this.a0.getTag() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z != z3) {
                AnimatorSet animatorSet = this.l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.a0;
                if (z) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.e0.getEditText().isFocused()) {
                    hl.t1(this.e0.getEditText());
                }
                this.e0.k(true);
                if (z) {
                    this.a0.setVisibility(0);
                    this.b0.setVisibility(0);
                }
                float f9 = 0.0f;
                float f10 = 0.2f;
                float f11 = 1.0f;
                if (z2) {
                    this.l0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    d26 d26Var = this.b0;
                    Property property = View.SCALE_X;
                    if (z) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(d26Var, property, f5));
                    d26 d26Var2 = this.b0;
                    Property property2 = View.SCALE_Y;
                    if (z) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(d26Var2, property2, f6));
                    d26 d26Var3 = this.b0;
                    Property property3 = View.ALPHA;
                    if (z) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(d26Var3, property3, f7));
                    tb tbVar = this.c0;
                    if (z) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(tbVar, property, f8));
                    tb tbVar2 = this.c0;
                    if (z) {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(tbVar2, property2, f10));
                    tb tbVar3 = this.c0;
                    if (!z) {
                        f11 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(tbVar3, property3, f11));
                    FrameLayout frameLayout2 = this.a0;
                    Property property4 = View.TRANSLATION_Y;
                    if (z) {
                        L2 = 0.0f;
                    } else {
                        L2 = hl.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.d0;
                    if (!z) {
                        f9 = hl.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f9));
                    this.l0.playTogether(arrayList);
                    this.l0.setInterpolator(new DecelerateInterpolator());
                    this.l0.setDuration(180L);
                    this.l0.addListener(new gf4((byte) 21, this, z));
                    this.l0.start();
                    return true;
                }
                d26 d26Var4 = this.b0;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.2f;
                }
                d26Var4.setScaleX(f);
                d26 d26Var5 = this.b0;
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.2f;
                }
                d26Var5.setScaleY(f2);
                d26 d26Var6 = this.b0;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                d26Var6.setAlpha(f3);
                tb tbVar4 = this.c0;
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.2f;
                }
                tbVar4.setScaleX(f4);
                tb tbVar5 = this.c0;
                if (z) {
                    f10 = 1.0f;
                }
                tbVar5.setScaleY(f10);
                tb tbVar6 = this.c0;
                if (!z) {
                    f11 = 0.0f;
                }
                tbVar6.setAlpha(f11);
                FrameLayout frameLayout3 = this.a0;
                if (z) {
                    L = 0.0f;
                } else {
                    L = hl.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.d0;
                if (!z) {
                    f9 = hl.L(48.0f);
                }
                view2.setTranslationY(f9);
                if (!z) {
                    this.a0.setVisibility(4);
                    this.b0.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        boolean z;
        if (this.e) {
            int childCount = this.L.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.L.getChildAt(i);
                boolean z2 = childAt instanceof d88;
                do6 do6Var = this.K;
                ArrayList arrayList = this.c;
                if (z2) {
                    d88 d88Var = (d88) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i2 = -1;
                    if (do6Var != null) {
                        no6 no6Var = (no6) do6Var.e.get(num.intValue());
                        if (this.e) {
                            i2 = arrayList.indexOf(Integer.valueOf(no6Var.C));
                        }
                        d88Var.setNum(i2);
                    } else {
                        ro6 ro6Var = (ro6) this.f.get(num.intValue());
                        if (this.e) {
                            i2 = arrayList.indexOf(ro6Var.B);
                        }
                        d88Var.setNum(i2);
                    }
                } else if (childAt instanceof zea) {
                    zea zeaVar = (zea) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((no6) do6Var.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zeaVar.b(z, false);
                }
            }
        }
    }

    public final void m0(int i) {
        boolean z;
        float f;
        int size = this.b.size();
        tb tbVar = this.c0;
        boolean z2 = true;
        if (size == 0) {
            tbVar.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            if (i == 0) {
                z2 = false;
            }
            k0(false, z2);
            return;
        }
        tbVar.invalidate();
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!k0(true, z) && i != 0) {
            this.c0.setPivotX(hl.L(21.0f));
            this.c0.setPivotY(hl.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            tb tbVar2 = this.c0;
            Property property = View.SCALE_X;
            float f2 = 0.9f;
            if (i == 1) {
                f = 1.1f;
            } else {
                f = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar2, property, f, 1.0f);
            tb tbVar3 = this.c0;
            Property property2 = View.SCALE_Y;
            if (i == 1) {
                f2 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(tbVar3, property2, f2, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.c0.setPivotX(0.0f);
        this.c0.setPivotY(0.0f);
    }

    public final void n0() {
        String str;
        t20 t20Var = this.M;
        if (t20Var != null) {
            t20Var.f();
        }
        if (!this.r && (this.n.size() <= 0 || ((str = this.w) != null && !TextUtils.isEmpty(str)))) {
            this.O.e(false, true);
        } else {
            this.O.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.e0;
        if (iu3Var != null && iu3Var.e) {
            if (z) {
                iu3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.s);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        jn7.f(this.currentAccount).n(this, jn7.s);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        iu3 iu3Var = this.e0;
        if (iu3Var != null) {
            iu3Var.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f) {
        d79 d79Var = this.L;
        if (d79Var == null) {
            return;
        }
        if (this.e0.e) {
            this.fragmentView.setTranslationY(f);
            this.L.setTranslationY(0.0f);
            return;
        }
        d79Var.setTranslationY(f);
    }

    @Override
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.M;
        if (t20Var != null) {
            t20Var.f();
        }
        iu3 iu3Var = this.e0;
        if (iu3Var != null) {
            iu3Var.s();
        }
        s7 s7Var = this.Q;
        if (s7Var != null) {
            s7Var.G(true);
            if (!TextUtils.isEmpty(this.q0)) {
                this.Q.P(this.q0, false);
                this.q0 = null;
                f0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        s7 s7Var;
        if (z && (s7Var = this.Q) != null) {
            hl.E3(s7Var.getSearchField());
        }
    }
}
