package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.LaunchActivity;
public final class lh6 extends kla implements AdapterView.OnItemSelectedListener, jm7 {
    public final oh2 E;
    public byte F;
    public wy2 G;
    public final ArrayList H;
    public final HashMap I;
    public final HashMap J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public Toast R;
    public String S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final jh6 a;
    public boolean a0;
    public final jh6 b;
    public CancellationTokenSource b0;
    public final TextView c;
    public he c0;
    public final blb d;
    public he d0;
    public final gt7 e;
    public boolean e0;
    public final gt7 f;
    public boolean f0;
    public v77 g0;
    public final TextView h;
    public final mh6 h0;
    public final l66 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final oh2 y;

    public lh6(mh6 mh6Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        this.h0 = mh6Var;
        this.F = (byte) 0;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.J = new HashMap();
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0L;
        this.T = -1;
        this.e0 = false;
        this.f0 = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.c = textView;
        ts2.s(textView, 1, 18.0f);
        if (mh6Var.G == 2) {
            i = 2131752491;
        } else {
            i = 2131742469;
        }
        textView.setText(jb6.M0(i, null));
        textView.setGravity(17);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new n06(this, context, (byte) 8));
        l66 l66Var = new l66(context, null);
        this.n = l66Var;
        if (mh6Var.G == 2) {
            i2 = 2131752492;
        } else {
            i2 = 2131744596;
        }
        l66Var.setText(jb6.M0(i2, null));
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(17);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(l66Var, qoe.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new jl3(context, (byte) 1));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772019);
        loadAnimation.setInterpolator(vt3.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(2131232195);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, qoe.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, qoe.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        gt7 gt7Var = new gt7(context, null);
        this.e = gt7Var;
        gt7Var.setText(jb6.M0(2131751691, null));
        gt7Var.addView(linearLayout, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        gt7Var.setForceUseCenter(true);
        gt7Var.setFocusable(true);
        gt7Var.setContentDescription(jb6.M0(2131751691, null));
        gt7Var.setOnFocusChangeListener(new tt0(this, (byte) 13));
        addView(gt7Var, qoe.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        gt7Var.setOnClickListener(new View.OnClickListener(this) {
            public final lh6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                c41 c41Var;
                String str;
                int i5;
                int i6;
                byte b = r2;
                lh6 lh6Var = this.b;
                switch (b) {
                    case 0:
                        mh6 mh6Var2 = lh6Var.h0;
                        if (mh6Var2.getParentActivity() != null) {
                            boolean z = !mh6Var2.E;
                            mh6Var2.E = z;
                            ((oh2) view).c(z, true);
                            boolean z2 = mh6Var2.E;
                            ne6 ne6Var = mh6Var2.a0;
                            if (z2) {
                                c41Var = new c41(ne6Var, null);
                                str = "SyncContactsOn";
                                i5 = 2131743975;
                                i6 = 2131623992;
                            } else {
                                c41Var = new c41(ne6Var, null);
                                str = "SyncContactsOff";
                                i5 = 2131743976;
                                i6 = 2131623991;
                            }
                            ts2.u(str, i5, c41Var, i6, 36);
                            return;
                        }
                        return;
                    case 1:
                        mh6 mh6Var3 = lh6Var.h0;
                        if (mh6Var3.getParentActivity() != null) {
                            boolean z3 = !mh6Var3.F;
                            mh6Var3.F = z3;
                            ((oh2) view).c(z3, true);
                            if (mh6Var3.getConnectionsManager().isTestBackend() != mh6Var3.F) {
                                mh6Var3.getConnectionsManager().switchBackend(false);
                            }
                            lh6Var.r();
                            return;
                        }
                        return;
                    default:
                        az2 az2Var = new az2(lh6Var.H, true);
                        az2Var.r = new hh6(lh6Var);
                        lh6Var.h0.presentFragment(az2Var);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        gt7 gt7Var2 = new gt7(context, null);
        this.f = gt7Var2;
        gt7Var2.addView(linearLayout2, qoe.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        gt7Var2.setText(jb6.M0(2131747023, null));
        addView(gt7Var2, qoe.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, qoe.o(-2, -2));
        jh6 jh6Var = new jh6(this, context, (byte) 0);
        this.a = jh6Var;
        jh6Var.setInputType(3);
        jh6Var.setCursorSize(gm.L(20.0f));
        jh6Var.setCursorWidth(1.5f);
        jh6Var.setPadding(gm.L(10.0f), 0, 0, 0);
        jh6Var.setTextSize(1, 16.0f);
        jh6Var.setMaxLines(1);
        jh6Var.setGravity(19);
        jh6Var.setImeOptions(268435461);
        jh6Var.setBackground(null);
        jh6Var.setShowSoftInputOnFocus(gm.A1());
        jh6Var.setContentDescription(jb6.M0(2131748497, null));
        linearLayout2.addView(jh6Var, qoe.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        jh6Var.addTextChangedListener(new og6(this, (byte) 1));
        jh6Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lh6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                byte b = r2;
                lh6 lh6Var = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 5) {
                            return false;
                        }
                        bh6 bh6Var = lh6Var.h0.c0;
                        if (bh6Var != null) {
                            bh6Var.h.callOnClick();
                        } else {
                            lh6Var.h(null);
                        }
                        return true;
                    default:
                        jh6 jh6Var2 = lh6Var.b;
                        if (i5 != 5) {
                            return false;
                        }
                        jh6Var2.requestFocus();
                        jh6Var2.setSelection(jh6Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k = qoe.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k.width = Math.max(2, gm.L(0.5f));
        linearLayout2.addView(view, k);
        jh6 jh6Var2 = new jh6(this, context, (byte) 1);
        this.b = jh6Var2;
        jh6Var2.setInputType(3);
        jh6Var2.setPadding(0, 0, 0, 0);
        jh6Var2.setCursorSize(gm.L(20.0f));
        jh6Var2.setCursorWidth(1.5f);
        jh6Var2.setTextSize(1, 16.0f);
        jh6Var2.setMaxLines(1);
        jh6Var2.setGravity(19);
        jh6Var2.setImeOptions(268435461);
        jh6Var2.setBackground(null);
        jh6Var2.setShowSoftInputOnFocus(gm.A1());
        jh6Var2.setContentDescription(jb6.M0(2131747023, null));
        linearLayout2.addView(jh6Var2, qoe.c(36.0f, -1));
        jh6Var2.addTextChangedListener(new sk2(this, (byte) 1));
        jh6Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lh6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                byte b = r2;
                lh6 lh6Var = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 5) {
                            return false;
                        }
                        bh6 bh6Var = lh6Var.h0.c0;
                        if (bh6Var != null) {
                            bh6Var.h.callOnClick();
                        } else {
                            lh6Var.h(null);
                        }
                        return true;
                    default:
                        jh6 jh6Var22 = lh6Var.b;
                        if (i5 != 5) {
                            return false;
                        }
                        jh6Var22.requestFocus();
                        jh6Var22.setSelection(jh6Var22.length());
                        return true;
                }
            }
        });
        int i5 = 56;
        if (mh6Var.y && mh6Var.G == 0) {
            oh2 oh2Var = new oh2(context, 2);
            this.y = oh2Var;
            oh2Var.e(jb6.M0(2131743983, "SyncContacts"), "", mh6Var.E, false, false);
            if (jb6.a0 && gm.M1()) {
                i4 = 56;
            } else {
                i4 = 0;
            }
            addView(oh2Var, qoe.t(-2, -1, 51, 16, 0, 16 + i4, 0));
            oh2Var.setOnClickListener(new View.OnClickListener(this) {
                public final lh6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    c41 c41Var;
                    String str;
                    int i52;
                    int i6;
                    byte b = r2;
                    lh6 lh6Var = this.b;
                    switch (b) {
                        case 0:
                            mh6 mh6Var2 = lh6Var.h0;
                            if (mh6Var2.getParentActivity() != null) {
                                boolean z = !mh6Var2.E;
                                mh6Var2.E = z;
                                ((oh2) view2).c(z, true);
                                boolean z2 = mh6Var2.E;
                                ne6 ne6Var = mh6Var2.a0;
                                if (z2) {
                                    c41Var = new c41(ne6Var, null);
                                    str = "SyncContactsOn";
                                    i52 = 2131743975;
                                    i6 = 2131623992;
                                } else {
                                    c41Var = new c41(ne6Var, null);
                                    str = "SyncContactsOff";
                                    i52 = 2131743976;
                                    i6 = 2131623991;
                                }
                                ts2.u(str, i52, c41Var, i6, 36);
                                return;
                            }
                            return;
                        case 1:
                            mh6 mh6Var3 = lh6Var.h0;
                            if (mh6Var3.getParentActivity() != null) {
                                boolean z3 = !mh6Var3.F;
                                mh6Var3.F = z3;
                                ((oh2) view2).c(z3, true);
                                if (mh6Var3.getConnectionsManager().isTestBackend() != mh6Var3.F) {
                                    mh6Var3.getConnectionsManager().switchBackend(false);
                                }
                                lh6Var.r();
                                return;
                            }
                            return;
                        default:
                            az2 az2Var = new az2(lh6Var.H, true);
                            az2Var.r = new hh6(lh6Var);
                            lh6Var.h0.presentFragment(az2Var);
                            return;
                    }
                }
            });
            i3 = 48;
        } else {
            i3 = 72;
        }
        boolean z = e21.a;
        if (mh6Var.G == 0) {
            oh2 oh2Var2 = new oh2(context, 2);
            this.E = oh2Var2;
            String M0 = jb6.M0(2131751543, null);
            boolean isTestBackend = mh6Var.getConnectionsManager().isTestBackend();
            mh6Var.F = isTestBackend;
            oh2Var2.e(M0, "", isTestBackend, false, false);
            addView(oh2Var2, qoe.t(-2, -1, 51, 16, 0, 16 + ((jb6.a0 && gm.M1()) ? i5 : 0), 0));
            i3 -= 24;
            oh2Var2.setOnClickListener(new View.OnClickListener(this) {
                public final lh6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    c41 c41Var;
                    String str;
                    int i52;
                    int i6;
                    byte b = r2;
                    lh6 lh6Var = this.b;
                    switch (b) {
                        case 0:
                            mh6 mh6Var2 = lh6Var.h0;
                            if (mh6Var2.getParentActivity() != null) {
                                boolean z2 = !mh6Var2.E;
                                mh6Var2.E = z2;
                                ((oh2) view2).c(z2, true);
                                boolean z22 = mh6Var2.E;
                                ne6 ne6Var = mh6Var2.a0;
                                if (z22) {
                                    c41Var = new c41(ne6Var, null);
                                    str = "SyncContactsOn";
                                    i52 = 2131743975;
                                    i6 = 2131623992;
                                } else {
                                    c41Var = new c41(ne6Var, null);
                                    str = "SyncContactsOff";
                                    i52 = 2131743976;
                                    i6 = 2131623991;
                                }
                                ts2.u(str, i52, c41Var, i6, 36);
                                return;
                            }
                            return;
                        case 1:
                            mh6 mh6Var3 = lh6Var.h0;
                            if (mh6Var3.getParentActivity() != null) {
                                boolean z3 = !mh6Var3.F;
                                mh6Var3.F = z3;
                                ((oh2) view2).c(z3, true);
                                if (mh6Var3.getConnectionsManager().isTestBackend() != mh6Var3.F) {
                                    mh6Var3.getConnectionsManager().switchBackend(false);
                                }
                                lh6Var.r();
                                return;
                            }
                            return;
                        default:
                            az2 az2Var = new az2(lh6Var.H, true);
                            az2Var.r = new hh6(lh6Var);
                            lh6Var.h0.presentFragment(az2Var);
                            return;
                    }
                }
            });
        }
        if (i3 > 0 && !gm.M1()) {
            View space = new Space(context);
            space.setMinimumHeight(gm.L(i3));
            addView(space, qoe.o(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ?? obj = new Object();
                obj.a = split[2];
                String str = split[0];
                obj.c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i0 = jb6.i0(2131750453, obj.d);
                    if (!TextUtils.isEmpty(i0) && !TextUtils.equals(obj.d, i0)) {
                        obj.b = obj.a;
                        obj.a = i0;
                    }
                }
                this.H.add(0, obj);
                List list = (List) this.I.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.I;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.J.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        Collections.sort(this.H, Comparator$CC.comparing(new x00((byte) 10)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        ConnectionsManager.getInstance(mh6Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new cx3(this, hashMap, (byte) 22), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.F = (byte) 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            jh6 jh6Var3 = this.b;
            jh6Var3.setSelection(jh6Var3.length());
        } else {
            this.a.requestFocus();
        }
        r();
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i;
        boolean z;
        float f;
        Context context = a.b;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i = 2130772021;
        } else {
            i = 2130772020;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        loadAnimation.setInterpolator(vt3.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        blb blbVar = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z = true;
        } else {
            z = false;
        }
        blbVar.a(charSequence, z, false);
        gt7 gt7Var = this.e;
        if (charSequence != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        gt7Var.b(f, f, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        if (i == nm7.m4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i5 = nm7.J2;
        if (i == i5) {
            mh6 mh6Var = this.h0;
            i3 = ((d) mh6Var).currentAccount;
            if (i2 == i3 && this.W) {
                this.W = false;
                i4 = ((d) mh6Var).currentAccount;
                nm7.f(i4).n(this, i5);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override
    public final void e() {
        this.N = false;
    }

    @Override
    public final void f() {
        int i;
        v77 v77Var = this.g0;
        if (v77Var != null) {
            v77Var.run();
            this.g0 = null;
        }
        this.a0 = true;
        if (this.W) {
            this.W = false;
            i = ((d) this.h0).currentAccount;
            nm7.f(i).n(this, nm7.J2);
        }
        CancellationTokenSource cancellationTokenSource = this.b0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.b0 = null;
        }
        he heVar = this.c0;
        if (heVar != null) {
            heVar.dismiss();
            this.c0 = null;
        }
        he heVar2 = this.d0;
        if (heVar2 != null) {
            heVar2.dismiss();
            this.d0 = null;
        }
    }

    @Override
    public String getHeaderName() {
        return jb6.M0(2131742459, "YourPhone");
    }

    @Override
    public final void h(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i2;
        boolean z8;
        if (this.h0.getParentActivity() != null && !this.N && !this.h0.r0) {
            boolean z9 = e21.a;
            fc4.b("sim status = " + ((TelephonyManager) a.b.getSystemService("phone")).getSimState());
            if (this.a.length() != 0 && this.b.length() != 0) {
                String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
                if (!this.O) {
                    Point point = gm.q;
                    if (point.x > point.y && !this.h0.s1() && this.h0.T.Q() > gm.L(20.0f)) {
                        mh6 mh6Var = this.h0;
                        mh6Var.U = new ch6(this, (byte) 1);
                        gm.t1(mh6Var.fragmentView);
                        return;
                    }
                    mh6 mh6Var2 = this.h0;
                    Context context = this.h0.fragmentView.getContext();
                    mh6 mh6Var3 = this.h0;
                    mh6Var2.c0 = new bh6(context, (ViewGroup) mh6Var3.fragmentView, mh6Var3.O, str2, new k44(this, (byte) 13));
                    bh6 bh6Var = this.h0.c0;
                    bh6Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new ah6(bh6Var, (byte) 0));
                    duration.addUpdateListener(new xg6(bh6Var, (byte) 1));
                    duration.setInterpolator(d53.f);
                    duration.start();
                    return;
                }
                this.O = false;
                bh6 bh6Var2 = this.h0.c0;
                if (bh6Var2 != null) {
                    int i3 = bh6.G;
                    bh6Var2.a();
                }
                boolean L1 = gm.L1();
                if (L1) {
                    if (this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.h0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 28 && this.h0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (i4 >= 26 && this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    mh6 mh6Var4 = this.h0;
                    z = L1;
                    if (mh6Var4.w) {
                        mh6Var4.r.clear();
                        if (!z4) {
                            this.h0.r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z5) {
                            this.h0.r.add("android.permission.CALL_PHONE");
                        }
                        if (!z3) {
                            this.h0.r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z8 && i4 >= 26) {
                            this.h0.r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.h0.r.isEmpty()) {
                            SharedPreferences d1 = oc7.d1();
                            if (!d1.getBoolean("firstlogin", true) && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.h0.getParentActivity().requestPermissions((String[]) this.h0.r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                            d1.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.h0.getParentActivity());
                            alertDialog$Builder.j(jb6.M0(2131751708, "Continue"), null);
                            int i5 = 2131623958;
                            if (!z4 && (!z5 || !z3)) {
                                alertDialog$Builder.a.U = jb6.M0(2131754239, "AllowReadCallAndLog");
                            } else if (z5 && z3) {
                                alertDialog$Builder.a.U = jb6.M0(2131754240, "AllowReadCall");
                                i5 = 2131624067;
                            } else {
                                alertDialog$Builder.a.U = jb6.M0(2131754238, "AllowReadCallLog");
                            }
                            int i6 = cmb.K5;
                            alertDialog$Builder.l(i5, 46, cmb.w0(null, i6, false), null);
                            alertDialog$Builder.m(i6, null);
                            mh6 mh6Var5 = this.h0;
                            mh6Var5.h = mh6Var5.showDialog(alertDialog$Builder.a);
                            this.O = true;
                            return;
                        }
                    }
                    z2 = true;
                } else {
                    z = L1;
                    z2 = true;
                    z3 = true;
                    z4 = true;
                    z5 = true;
                }
                if (this.F == z2) {
                    this.h0.z1(jb6.M0(2131745804, null), jb6.M0(2131752071, "ChooseCountry"));
                    this.h0.y1(false, z2);
                    return;
                }
                String str3 = "";
                String h = r58.h("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
                mh6 mh6Var6 = this.h0;
                if (mh6Var6.G == 0 && (mh6Var6.getParentActivity() instanceof LaunchActivity)) {
                    for (int i7 = 0; i7 < 4; i7++) {
                        z8c h2 = z8c.h(i7);
                        if (h2.o() && PhoneNumberUtils.compare(h, h2.f().phone)) {
                            boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
                            mh6 mh6Var7 = this.h0;
                            if (isTestBackend == mh6Var7.F) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mh6Var7.getParentActivity());
                                alertDialog$Builder2.a.S = jb6.M0(2131689472, null);
                                alertDialog$Builder2.a.U = jb6.M0(2131754708, "AccountAlreadyLoggedIn");
                                alertDialog$Builder2.j(jb6.M0(2131754693, "AccountSwitch"), new ji(this, i7, (byte) 13));
                                alertDialog$Builder2.g(jb6.M0(2131747564, "OK"), null);
                                this.h0.showDialog(alertDialog$Builder2.a);
                                this.h0.y1(false, true);
                                return;
                            }
                        }
                    }
                }
                ArrayList arrayList = null;
                TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
                if (z && z4 && z5 && z3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                tL_codeSettings.allow_flashcall = z6;
                if (z && z4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                tL_codeSettings.allow_missed_call = z7;
                boolean hasServices = b.b.hasServices();
                tL_codeSettings.allow_firebase = hasServices;
                tL_codeSettings.allow_app_hash = hasServices;
                if (this.h0.m0 || TextUtils.isEmpty(e21.f)) {
                    tL_codeSettings.allow_firebase = false;
                }
                ArrayList b = p50.b();
                if (b != null) {
                    for (int i8 = 0; i8 < b.size(); i8++) {
                        if (((TLRPC.TL_auth_authorization) b.get(i8)).future_auth_token != null) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            boolean z10 = e21.a;
                            fc4.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b.get(i8)).future_auth_token, StandardCharsets.UTF_8)));
                            tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b.get(i8)).future_auth_token);
                            if (tL_codeSettings.logout_tokens.size() >= 20) {
                                break;
                            }
                        }
                    }
                }
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens", 0);
                int i9 = sharedPreferences.getInt("count", 0);
                if (i9 != 0) {
                    arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < i9) {
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i10, str3)));
                        String str4 = str3;
                        TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                        i10++;
                        sharedPreferences = sharedPreferences2;
                        str3 = str4;
                    }
                }
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ArrayList<byte[]> arrayList2 = tL_codeSettings.logout_tokens;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                            tL_codeSettings.logout_tokens = arrayList2;
                        }
                        arrayList2.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i11)).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                    SharedPreferences sharedPreferences3 = a.b.getSharedPreferences("saved_tokens", 0);
                    ArrayList arrayList3 = new ArrayList();
                    sharedPreferences3.edit().clear().apply();
                    System.currentTimeMillis();
                    for (int i12 = 0; i12 < Math.min(20, arrayList.size()); i12++) {
                        arrayList3.add((TLRPC.TL_auth_loggedOut) arrayList.get(i12));
                    }
                    if (arrayList3.size() > 0) {
                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                        edit.putInt("count", arrayList3.size());
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList3.get(i13)).getObjectSize());
                            ((TLRPC.TL_auth_loggedOut) arrayList3.get(i13)).serializeToStream(serializedData2);
                            edit.putString("log_out_token_" + i13, Utilities.f(serializedData2.toByteArray()));
                        }
                        edit.apply();
                    }
                }
                if (tL_codeSettings.logout_tokens != null) {
                    tL_codeSettings.flags |= 64;
                }
                SharedPreferences sharedPreferences4 = a.b.getSharedPreferences("mainconfig", 0);
                sharedPreferences4.edit().remove("sms_hash_code").apply();
                if (tL_codeSettings.allow_app_hash) {
                    SharedPreferences.Editor edit2 = sharedPreferences4.edit();
                    a.t();
                    edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
                } else {
                    sharedPreferences4.edit().remove("sms_hash").apply();
                }
                if (tL_codeSettings.allow_flashcall) {
                    try {
                        HashSet r1 = this.h0.r1();
                        if (!r1.isEmpty()) {
                            tL_codeSettings.unknown_number = false;
                            tL_codeSettings.current_number = Collection.EL.stream(r1).anyMatch(new gz5(h, (byte) 1));
                        } else {
                            tL_codeSettings.unknown_number = true;
                            if (z8c.c() > 0) {
                                tL_codeSettings.allow_flashcall = false;
                            } else {
                                tL_codeSettings.current_number = false;
                            }
                        }
                    } catch (Exception e2) {
                        tL_codeSettings.unknown_number = true;
                        fc4.g(e2, true);
                    }
                }
                mh6 mh6Var8 = this.h0;
                if (mh6Var8.G != 2) {
                    i = ((d) mh6Var8).currentAccount;
                    ConnectionsManager.getInstance(i).cleanup(false);
                    TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                    tL_auth_sendCode2.api_hash = e21.e;
                    tL_auth_sendCode2.api_id = e21.d;
                    tL_auth_sendCode2.phone_number = h;
                    tL_auth_sendCode2.settings = tL_codeSettings;
                    tL_auth_sendCode = tL_auth_sendCode2;
                } else {
                    TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                    sendchangephonecode.phone_number = h;
                    sendchangephonecode.settings = tL_codeSettings;
                    tL_auth_sendCode = sendchangephonecode;
                }
                TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                Bundle bundle = new Bundle();
                bundle.putString("phone", "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText()));
                try {
                    bundle.putString("ephone", "+" + r58.h(this.a.getText().toString(), false) + " " + r58.h(this.b.getText().toString(), false));
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    bundle.putString("ephone", "+" + h);
                }
                bundle.putString("phoneFormated", h);
                wy2 wy2Var = this.G;
                if (wy2Var != null) {
                    bundle.putString("country", wy2Var.c);
                }
                this.N = true;
                in3 in3Var = new in3((byte) 14, false);
                in3Var.c = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
                in3Var.b = this.G;
                in3Var.d = (List) this.J.get(this.a.getText().toString());
                i2 = ((d) this.h0).currentAccount;
                this.h0.B1(ConnectionsManager.getInstance(i2).sendRequest(tL_auth_sendCode3, new fo0(this, bundle, h, in3Var, tL_auth_sendCode3, (byte) 8), 27), true);
                return;
            }
            mh6.E1(this.f, false);
        }
    }

    @Override
    public final void j() {
        p();
        oh2 oh2Var = this.y;
        if (oh2Var != null) {
            oh2Var.c(this.h0.E, false);
        }
        gm.d3(new ch6(this, (byte) 0), mh6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final boolean o() {
        mh6 mh6Var = this.h0;
        Activity parentActivity = mh6Var.getParentActivity();
        if (!this.a0 && !this.N && mh6Var.a == 0 && parentActivity != null && !parentActivity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.a.setText(((wy2) this.H.get(i)).c);
        this.L = false;
    }

    public final void p() {
        boolean z;
        boolean z2;
        boolean z3;
        wy2 wy2Var;
        if (!this.U && this.h0.G == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                if (gm.L1()) {
                    if (this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 26 && this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    mh6 mh6Var = this.h0;
                    if (mh6Var.x && (!z || !z2)) {
                        mh6Var.s.clear();
                        if (!z) {
                            this.h0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z2 && i >= 26) {
                            this.h0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.h0.s.isEmpty()) {
                            new k16(this, new ArrayList(this.h0.s), (byte) 27).run();
                            return;
                        }
                        return;
                    }
                    this.U = true;
                    if (!mh6Var.y && z && z2) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String h = r58.h(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(h)) {
                            int i2 = 4;
                            String str = null;
                            if (h.length() > 4) {
                                while (true) {
                                    if (i2 >= 1) {
                                        String substring = h.substring(0, i2);
                                        List list = (List) this.I.get(substring);
                                        if (list == null) {
                                            wy2Var = null;
                                        } else if (list.size() > 1) {
                                            String string = oc7.d1().getString("phone_code_last_matched_" + substring, null);
                                            wy2Var = (wy2) list.get(list.size() - 1);
                                            if (string != null) {
                                                ArrayList arrayList = this.H;
                                                int size = arrayList.size();
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 >= size) {
                                                        break;
                                                    }
                                                    Object obj = arrayList.get(i3);
                                                    i3++;
                                                    wy2 wy2Var2 = (wy2) obj;
                                                    if (Objects.equals(wy2Var2.d, string)) {
                                                        wy2Var = wy2Var2;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            wy2Var = (wy2) list.get(0);
                                        }
                                        if (wy2Var != null) {
                                            str = h.substring(i2);
                                            this.a.setText(substring);
                                            z3 = true;
                                            break;
                                        }
                                        i2--;
                                    } else {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (!z3) {
                                    str = h.substring(1);
                                    this.a.setText(h.substring(0, 1));
                                }
                            }
                            if (str != null) {
                                this.b.requestFocus();
                                this.b.setText(str);
                                jh6 jh6Var = this.b;
                                jh6Var.setSelection(jh6Var.length());
                            }
                        }
                        if (this.b.length() > 0) {
                            AnimatorSet duration = new AnimatorSet().setDuration(300L);
                            jh6 jh6Var2 = this.a;
                            Property property = View.ALPHA;
                            duration.playTogether(ObjectAnimator.ofFloat(jh6Var2, property, 1.0f), ObjectAnimator.ofFloat(this.b, property, 1.0f));
                            duration.start();
                            this.O = true;
                            return;
                        }
                        this.a.setAlpha(1.0f);
                        this.b.setAlpha(1.0f);
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void q() {
        String str;
        int i;
        String str2 = this.S;
        jh6 jh6Var = this.b;
        if (jh6Var.getText() == null) {
            str = "";
        } else {
            str = jh6Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.J;
        String str3 = null;
        if (hashMap.get(str2) != null && !((List) hashMap.get(str2)).isEmpty()) {
            List list = (List) hashMap.get(str2);
            if (!str.isEmpty()) {
                i = 0;
                while (i < list.size()) {
                    if (str.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i == -1) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String str4 = (String) list.get(i2);
                    if (str4.startsWith("X") || str4.startsWith("0")) {
                        i = i2;
                        break;
                    }
                }
                if (i == -1) {
                    i = 0;
                }
            }
            if (this.T != i) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i);
                int selectionStart = jh6Var.getSelectionStart();
                int selectionEnd = jh6Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                jh6Var.setHintText(str3);
                jh6Var.setSelection(Math.max(0, Math.min(jh6Var.length(), selectionStart)), Math.max(0, Math.min(jh6Var.length(), selectionEnd)));
                this.T = i;
            }
        } else if (this.T != -1) {
            int selectionStart2 = jh6Var.getSelectionStart();
            int selectionEnd2 = jh6Var.getSelectionEnd();
            jh6Var.setHintText((String) null);
            jh6Var.setSelection(selectionStart2, selectionEnd2);
            this.T = -1;
        }
    }

    public final void r() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (jb6.D0().B != null) {
            country = jb6.D0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.h0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new gh6(this, (byte) 0), 10);
    }

    public final void s() {
        int i;
        int i2;
        int i3;
        mh6 mh6Var = this.h0;
        if (mh6Var.G == 0 && !this.V && !this.a0) {
            i = ((d) mh6Var).currentAccount;
            oc7 r1 = oc7.r1(i);
            if (!r1.C3) {
                if (!this.W) {
                    this.W = true;
                    i2 = ((d) mh6Var).currentAccount;
                    nm7.f(i2).a(this, nm7.J2);
                    i3 = ((d) mh6Var).currentAccount;
                    ConnectionsManager.getInstance(i3).updateDcSettings();
                    return;
                }
                return;
            }
            this.V = true;
            boolean z = e21.j;
            if (z && r1.D3) {
                sk3 sk3Var = new sk3(this, (byte) 25);
                if (!z) {
                    sk3Var.a(Collections.EMPTY_LIST);
                    return;
                }
                aj4 aj4Var = ej4.a;
                if (aj4Var == null) {
                    Object b = li4.c().b(aj4.class);
                    b.getClass();
                    aj4Var = (aj4) b;
                    ej4.a = aj4Var;
                }
                j2d.b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
                q2d q2dVar = new q2d(lm2.b(0, 1));
                d1d d1dVar = ((j2d) aj4Var).a;
                li0 li0Var = d1d.l;
                Log.i(li0Var.b, li0Var.b("Requesting verification support info.", new Object[0]));
                bib b2 = cib.b();
                b2.c = new o94[]{ufd.a};
                b2.a = new lcc(q2dVar, (byte) 18);
                b2.d = (char) 37303;
                Task e = d1dVar.e(0, b2.a());
                e.getClass();
                Task continueWithTask = e.continueWithTask(new Object());
                continueWithTask.getClass();
                continueWithTask.addOnSuccessListener(new kc((byte) 0), new bj4(sk3Var)).addOnFailureListener(new kc((byte) 0), new bj4(sk3Var));
                return;
            }
            t(false);
        }
    }

    public final void t(final boolean z) {
        boolean z2;
        final int i;
        v77 v77Var;
        mh6 mh6Var = this.h0;
        if (mh6Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z2 = e21.i) && !this.f0) {
            if (z || !this.e0) {
                this.f0 = true;
                this.e0 = true;
                final Context context = getContext();
                i = ((d) mh6Var).currentAccount;
                final fh6 fh6Var = new fh6(this, (byte) 0);
                if (!z2) {
                    v77Var = null;
                } else {
                    context.getClass();
                    final uk0 uk0Var = new uk0(context, (byte) 1);
                    final boolean[] zArr = new boolean[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = e21.d;
                    initpasskeylogin.api_hash = e21.e;
                    final Runnable[] runnableArr = {new rt2(i, ConnectionsManager.getInstance(i).sendRequestTyped(initpasskeylogin, new kc((byte) 0), new jac() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            ly7.b(zArr, fh6Var, z, uk0Var, context, i, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), (byte) 6)};
                    v77Var = new v77(zArr, runnableArr, (byte) 1);
                }
                this.g0 = v77Var;
            }
        }
    }

    public final void u(String str, wy2 wy2Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = jb6.E0(wy2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new vy2((byte) 4), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) wy2Var.a);
        setCountryButtonText(gw3.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        q();
    }

    @Override
    public final void updateColors() {
        this.c.setTextColor(cmb.w0(null, cmb.F6, false));
        int w0 = cmb.w0(null, cmb.C6, false);
        l66 l66Var = this.n;
        l66Var.setTextColor(w0);
        l66Var.setLinkTextColor(cmb.w0(null, cmb.Wc, false));
        int i = 0;
        while (true) {
            blb blbVar = this.d;
            if (i >= blbVar.getChildCount()) {
                break;
            }
            TextView textView = (TextView) blbVar.getChildAt(i);
            textView.setTextColor(cmb.w0(null, cmb.F6, false));
            textView.setHintTextColor(cmb.w0(null, cmb.G6, false));
            i++;
        }
        int i2 = cmb.G6;
        int w02 = cmb.w0(null, i2, false);
        int i3 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        mh6.m1(imageView, w02, i3, mode);
        this.w = w02;
        int themedColor = this.h0.getThemedColor(cmb.h6);
        mh6.n1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i4 = cmb.F6;
        this.h.setTextColor(cmb.w0(null, i4, false));
        int w03 = cmb.w0(null, i4, false);
        jh6 jh6Var = this.a;
        jh6Var.setTextColor(w03);
        int i5 = cmb.k6;
        jh6Var.setCursorColor(cmb.w0(null, i5, false));
        this.r.setBackgroundColor(cmb.w0(null, cmb.j6, false));
        int w04 = cmb.w0(null, i4, false);
        jh6 jh6Var2 = this.b;
        jh6Var2.setTextColor(w04);
        jh6Var2.setHintTextColor(cmb.w0(null, i2, false));
        jh6Var2.setCursorColor(cmb.w0(null, i5, false));
        oh2 oh2Var = this.y;
        if (oh2Var != null) {
            int i6 = cmb.X6;
            int i7 = cmb.V6;
            int i8 = cmb.W6;
            CheckBoxSquare checkBoxSquare = oh2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i6;
                checkBoxSquare.w = i7;
                checkBoxSquare.x = i8;
                checkBoxSquare.invalidate();
            }
            oh2Var.g();
        }
        oh2 oh2Var2 = this.E;
        if (oh2Var2 != null) {
            int i9 = cmb.X6;
            int i10 = cmb.V6;
            int i11 = cmb.W6;
            CheckBoxSquare checkBoxSquare2 = oh2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i9;
                checkBoxSquare2.w = i10;
                checkBoxSquare2.x = i11;
                checkBoxSquare2.invalidate();
            }
            oh2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
