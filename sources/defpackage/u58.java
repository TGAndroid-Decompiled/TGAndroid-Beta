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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u58 extends d implements gk7 {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final xl6 K;
    public o39 L;
    public s20 M;
    public q58 N;
    public zya O;
    public xk2 P;
    public r7 Q;
    public a8 R;
    public int S;
    public boolean T;
    public final byte U;
    public final mu1 V;
    public w49 W;
    public byte X;
    public boolean Y;
    public boolean Z;
    public final boolean a;
    public FrameLayout a0;
    public final HashMap b;
    public oc6 b0;
    public final ArrayList c;
    public sb c0;
    public Editable d;
    public View d0;
    public boolean e;
    public rt3 e0;
    public final ArrayList f;
    public ImageView f0;
    public p58 g0;
    public final HashMap h;
    public byte h0;
    public final TextPaint i0;
    public final RectF j0;
    public final Paint k0;
    public AnimatorSet l0;
    public boolean m0;
    public final ArrayList n;
    public m8 n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public a8[] p0;
    public String q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public final boolean s0;
    public s58 t0;
    public t58 u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final int x0;
    public int y;
    public final o58 y0;

    public u58(int i, xl6 xl6Var, HashMap hashMap, ArrayList arrayList, int i2, boolean z, mu1 mu1Var, boolean z2) {
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
        this.y0 = new o58(this);
        this.K = xl6Var;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i;
        this.U = i2;
        this.V = mu1Var;
        this.F = z;
        this.s0 = z2;
        if (xl6Var == null) {
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
            this.v0 = bkb.kh;
            this.w0 = bkb.Xg;
            this.x0 = bkb.Yg;
            return;
        }
        this.v0 = bkb.g5;
        this.w0 = bkb.i5;
        this.x0 = bkb.H5;
    }

    public final int a0(int i, Object obj) {
        Object obj2;
        boolean z = obj instanceof jm6;
        if (z) {
            obj2 = Integer.valueOf(((jm6) obj).C);
        } else if (obj instanceof nm6) {
            obj2 = ((nm6) obj).B;
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
                    ((jm6) obj).e();
                } else if (obj instanceof nm6) {
                    ((nm6) obj).e();
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
        hashSet.add(Integer.valueOf(bkb.ca));
    }

    public final void b0() {
        this.n.clear();
        s20 s20Var = this.M;
        if (s20Var != null) {
            s20Var.f();
        }
        this.O.e(false, true);
        g0();
    }

    public final o48 c0(int i) {
        int childCount = this.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.L.getChildAt(i2);
            if (childAt instanceof o48) {
                o48 o48Var = (o48) childAt;
                int intValue = ((Integer) o48Var.getTag()).intValue();
                xl6 xl6Var = this.K;
                if (xl6Var == null ? !(intValue < 0 || intValue >= this.f.size()) : !(intValue < 0 || intValue >= xl6Var.e.size())) {
                    if (intValue == i) {
                        return o48Var;
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
        zkb.h(i, null, aVar);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        int i2 = this.w0;
        zkb.l(aVar2, 5, i2, null);
        zkb.l(this.actionBar, 1, i2, null);
        zkb.l(this.actionBar, 3, this.x0, null);
        this.actionBar.setBackButtonImage(2131231243);
        boolean z2 = this.a;
        xl6 xl6Var = this.K;
        if (xl6Var != null) {
            this.actionBar.setTitle(xl6Var.c);
        } else if (!z2) {
            this.actionBar.setTitle(k96.M0(2131745569, null));
        } else if (z2) {
            this.actionBar.setTitle(k96.M0(2131745572, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 19));
        if (this.m0) {
            r7 a = this.actionBar.t().a(0, 2131231247);
            a.setSubMenuDelegate(new pj4(this, (byte) 23));
            this.R = a.e(1, 2131232213, k96.M0(2131745153, null));
            a.e(2, 2131232270, k96.M0(2131747603, null));
        }
        if (xl6Var == null) {
            r7 a2 = this.actionBar.t().a(0, 2131232491);
            a2.N();
            a2.I = new cm0(this);
            this.Q = a2;
            EditTextBoldCursor searchField = a2.getSearchField();
            zkb.X(searchField, i2, null);
            zkb.v(searchField, i2, null);
            zkb.D(searchField, bkb.Le, null);
            if (!z2) {
                this.Q.setSearchFieldHint(k96.M0(2131745569, null));
            } else if (z2) {
                this.Q.setSearchFieldHint(k96.M0(2131745572, null));
            }
        }
        p58 p58Var = new p58(this, context);
        this.g0 = p58Var;
        zkb.h(i, null, p58Var);
        this.fragmentView = this.g0;
        o39 o39Var = new o39(context, null);
        this.L = o39Var;
        o39Var.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        o39 o39Var2 = this.L;
        ?? r35Var = new r35(4);
        this.N = r35Var;
        o39Var2.setLayoutManager(r35Var);
        this.N.O = new nq1(this, (byte) 12);
        this.g0.addView(this.L, nme.e(-1, -1, 51));
        o39 o39Var3 = this.L;
        s20 s20Var = new s20(this, context, (byte) 12);
        this.M = s20Var;
        o39Var3.setAdapter(s20Var);
        zkb.H(this.L, i, null);
        this.L.setOnItemClickListener(new bf4(this, (byte) 18));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new m58(this, (byte) 3));
        }
        w49 w49Var = new w49(new gi3(this));
        this.W = w49Var;
        if (this.I != 1) {
            this.L.F.add(w49Var);
        }
        xk2 xk2Var = new xk2(context, getResourceProvider(), (byte) 3);
        this.P = xk2Var;
        xk2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        zya zyaVar = new zya(context, this.P, 1, getResourceProvider());
        this.O = zyaVar;
        zyaVar.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        zkb.X(this.O.d, bkb.x6, getResourceProvider());
        this.O.addView(this.P, 0);
        zya zyaVar2 = this.O;
        if (xl6Var != null) {
            zyaVar2.d.setText(k96.M0(2131747988, null));
        } else {
            zyaVar2.d.setText(k96.M0(2131747977, null));
        }
        this.O.e(false, false);
        this.g0.addView(this.O, nme.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new n58(this, (byte) 0));
        if (xl6Var == null) {
            n0();
        }
        if (this.r0) {
            View view = new View(context);
            this.d0 = view;
            view.setBackgroundResource(2131231241);
            this.d0.setTranslationY(gl.L(48.0f));
            this.g0.addView(this.d0, nme.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.a0 = frameLayout;
            zkb.h(i, null, frameLayout);
            this.a0.setVisibility(4);
            this.a0.setTranslationY(gl.L(48.0f));
            this.g0.addView(this.a0, nme.e(-1, 48, 83));
            this.a0.setOnTouchListener(new jz1((byte) 20));
            rt3 rt3Var = this.e0;
            if (rt3Var != null) {
                rt3Var.o();
            }
            this.e0 = new rt3(context, this.g0, null, 1, false, null);
            this.e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(na7.q1(y6c.t0).F0())});
            this.e0.setHint(k96.M0(2131754451, null));
            this.e0.s();
            gt3 editText = this.e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.a0.addView(this.e0, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            Editable editable = this.d;
            if (editable != null) {
                this.e0.setText(editable);
            }
            this.e0.getEditText().addTextChangedListener(new jf6(this, (byte) 5));
            oc6 oc6Var = new oc6((byte) 7, context, this);
            this.b0 = oc6Var;
            oc6Var.setFocusable(true);
            this.b0.setFocusableInTouchMode(true);
            this.b0.setVisibility(4);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.b0.setAlpha(0.0f);
            this.g0.addView(this.b0, nme.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f0 = new ImageView(context);
            this.f0.setBackgroundDrawable(bkb.h0(gl.L(56.0f), bkb.w0(null, bkb.R5, false), bkb.w0(null, bkb.S5, false)));
            this.f0.setImageResource(2131230876);
            this.f0.setImportantForAccessibility(2);
            zkb.s(this.f0, bkb.T5, null, PorterDuff.Mode.MULTIPLY);
            this.f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f0.setOutlineProvider(new xi((byte) 9));
            this.b0.addView(this.f0, nme.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f0.setOnClickListener(new fr7(this, (byte) 12));
            this.f0.setOnLongClickListener(new zs(this, (byte) 9));
            TextPaint textPaint = this.i0;
            textPaint.setTextSize(gl.L(12.0f));
            textPaint.setTypeface(gl.o());
            sb sbVar = new sb((byte) 24, context, this);
            this.c0 = sbVar;
            sbVar.setAlpha(0.0f);
            this.c0.setScaleX(0.2f);
            this.c0.setScaleY(0.2f);
            this.g0.addView(this.c0, nme.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.e0.setVisibility(8);
            }
        }
        if ((xl6Var != null || !z2 || z2) && this.J) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.L.setEmptyView(this.O);
        o39 o39Var4 = this.L;
        o39Var4.X1 = true;
        o39Var4.Y1 = false;
        m0(0);
        return this.fragmentView;
    }

    public final void d0(TLObject tLObject, boolean z) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        na7.q1(this.currentAccount).b4(tL_contacts_resolvedPeer.users, false);
        na7.q1(this.currentAccount).V3(tL_contacts_resolvedPeer.chats, false);
        ad7.Y(this.currentAccount).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.H;
        this.H = null;
        h0(str, "", z, false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.s) {
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
        if (view instanceof iba) {
            ((iba) view).b(this.c.contains(Integer.valueOf(((jm6) this.K.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        if (!z) {
            i = 2;
        }
        m0(i);
        this.t0.e();
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
            this.O.d.setText(k96.M0(2131747977, null));
        } else {
            this.O.d.setText(k96.a0("NoResultFoundFor", null, 2131747974, this.w));
        }
        n0();
    }

    public final void g0() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            edit.putString(de9.k(i, "recent"), (String) this.n.get(i));
        }
        edit.commit();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.v0));
        arrayList.add(new blb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.v0));
        arrayList.add(new blb(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        arrayList.add(new blb(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        arrayList.add(new blb(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.x0));
        arrayList.add(new blb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        r7 r7Var = this.Q;
        if (r7Var != null) {
            editTextBoldCursor = r7Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new blb(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.w0));
        arrayList.add(new blb(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.v0));
        arrayList.add(new blb(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.W9));
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
        na7 q1 = na7.q1(this.currentAccount);
        na7 q12 = na7.q1(this.currentAccount);
        if (z) {
            str3 = q12.o3;
        } else {
            str3 = q12.p3;
        }
        TLObject a2 = q1.a2(str3);
        if (!(a2 instanceof TLRPC.User)) {
            if (z2 && !this.G) {
                this.G = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                na7 q13 = na7.q1(this.currentAccount);
                if (z) {
                    str5 = q13.o3;
                } else {
                    str5 = q13.p3;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new i81((byte) 10, this, z));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) a2;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = na7.q1(this.currentAccount).o1(user);
        tL_messages_getInlineBotResults.offset = str2;
        mu1 mu1Var = this.V;
        if (mu1Var != null) {
            long a = mu1Var.a();
            if (cf3.B(a)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().h1(a);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i = this.E + 1;
        this.E = i;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new h87(this, str, i, z, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    public final void i0(int i, boolean z) {
        HashMap hashMap = this.b;
        if (!hashMap.isEmpty() && this.t0 != null && !this.T) {
            rt3 rt3Var = this.e0;
            if (rt3Var != null && rt3Var.a.length() > 0) {
                Object obj = hashMap.get(this.c.get(0));
                if (obj instanceof jm6) {
                    ((jm6) obj).a = this.e0.getText().toString();
                } else if (obj instanceof nm6) {
                    ((nm6) obj).I = this.e0.getText().toString();
                }
            }
            this.T = true;
            this.t0.l(i, false, z);
            if (this.U != 2) {
                s58 s58Var = this.t0;
                if (s58Var == null || s58Var.c()) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (gl.B(bkb.w0(null, bkb.Z6, false)) <= 0.721f) {
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
                    gl.t1(this.e0.getEditText());
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
                    oc6 oc6Var = this.b0;
                    Property property = View.SCALE_X;
                    if (z) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(oc6Var, property, f5));
                    oc6 oc6Var2 = this.b0;
                    Property property2 = View.SCALE_Y;
                    if (z) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(oc6Var2, property2, f6));
                    oc6 oc6Var3 = this.b0;
                    Property property3 = View.ALPHA;
                    if (z) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(oc6Var3, property3, f7));
                    sb sbVar = this.c0;
                    if (z) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(sbVar, property, f8));
                    sb sbVar2 = this.c0;
                    if (z) {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(sbVar2, property2, f10));
                    sb sbVar3 = this.c0;
                    if (!z) {
                        f11 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(sbVar3, property3, f11));
                    FrameLayout frameLayout2 = this.a0;
                    Property property4 = View.TRANSLATION_Y;
                    if (z) {
                        L2 = 0.0f;
                    } else {
                        L2 = gl.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, L2));
                    View view = this.d0;
                    if (!z) {
                        f9 = gl.L(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f9));
                    this.l0.playTogether(arrayList);
                    this.l0.setInterpolator(new DecelerateInterpolator());
                    this.l0.setDuration(180L);
                    this.l0.addListener(new id4((byte) 21, this, z));
                    this.l0.start();
                    return true;
                }
                oc6 oc6Var4 = this.b0;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.2f;
                }
                oc6Var4.setScaleX(f);
                oc6 oc6Var5 = this.b0;
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.2f;
                }
                oc6Var5.setScaleY(f2);
                oc6 oc6Var6 = this.b0;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                oc6Var6.setAlpha(f3);
                sb sbVar4 = this.c0;
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.2f;
                }
                sbVar4.setScaleX(f4);
                sb sbVar5 = this.c0;
                if (z) {
                    f10 = 1.0f;
                }
                sbVar5.setScaleY(f10);
                sb sbVar6 = this.c0;
                if (!z) {
                    f11 = 0.0f;
                }
                sbVar6.setAlpha(f11);
                FrameLayout frameLayout3 = this.a0;
                if (z) {
                    L = 0.0f;
                } else {
                    L = gl.L(48.0f);
                }
                frameLayout3.setTranslationY(L);
                View view2 = this.d0;
                if (!z) {
                    f9 = gl.L(48.0f);
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
                boolean z2 = childAt instanceof o48;
                xl6 xl6Var = this.K;
                ArrayList arrayList = this.c;
                if (z2) {
                    o48 o48Var = (o48) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i2 = -1;
                    if (xl6Var != null) {
                        jm6 jm6Var = (jm6) xl6Var.e.get(num.intValue());
                        if (this.e) {
                            i2 = arrayList.indexOf(Integer.valueOf(jm6Var.C));
                        }
                        o48Var.setNum(i2);
                    } else {
                        nm6 nm6Var = (nm6) this.f.get(num.intValue());
                        if (this.e) {
                            i2 = arrayList.indexOf(nm6Var.B);
                        }
                        o48Var.setNum(i2);
                    }
                } else if (childAt instanceof iba) {
                    iba ibaVar = (iba) childAt;
                    if (arrayList.indexOf(Integer.valueOf(((jm6) xl6Var.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ibaVar.b(z, false);
                }
            }
        }
    }

    public final void m0(int i) {
        boolean z;
        float f;
        int size = this.b.size();
        sb sbVar = this.c0;
        boolean z2 = true;
        if (size == 0) {
            sbVar.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            if (i == 0) {
                z2 = false;
            }
            k0(false, z2);
            return;
        }
        sbVar.invalidate();
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!k0(true, z) && i != 0) {
            this.c0.setPivotX(gl.L(21.0f));
            this.c0.setPivotY(gl.L(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            sb sbVar2 = this.c0;
            Property property = View.SCALE_X;
            float f2 = 0.9f;
            if (i == 1) {
                f = 1.1f;
            } else {
                f = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sbVar2, property, f, 1.0f);
            sb sbVar3 = this.c0;
            Property property2 = View.SCALE_Y;
            if (i == 1) {
                f2 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(sbVar3, property2, f2, 1.0f));
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
        s20 s20Var = this.M;
        if (s20Var != null) {
            s20Var.f();
        }
        if (!this.r && (this.n.size() <= 0 || ((str = this.w) != null && !TextUtils.isEmpty(str)))) {
            this.O.e(false, true);
        } else {
            this.O.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.e0;
        if (rt3Var != null && rt3Var.e) {
            if (z) {
                rt3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.s);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        kk7.f(this.currentAccount).n(this, kk7.s);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        rt3 rt3Var = this.e0;
        if (rt3Var != null) {
            rt3Var.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f) {
        o39 o39Var = this.L;
        if (o39Var == null) {
            return;
        }
        if (this.e0.e) {
            this.fragmentView.setTranslationY(f);
            this.L.setTranslationY(0.0f);
            return;
        }
        o39Var.setTranslationY(f);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.M;
        if (s20Var != null) {
            s20Var.f();
        }
        rt3 rt3Var = this.e0;
        if (rt3Var != null) {
            rt3Var.s();
        }
        r7 r7Var = this.Q;
        if (r7Var != null) {
            r7Var.G(true);
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
        r7 r7Var;
        if (z && (r7Var = this.Q) != null) {
            gl.E3(r7Var.getSearchField());
        }
    }
}
