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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.LaunchActivity;
public final class ph6 extends cna implements AdapterView.OnItemSelectedListener, fn7 {
    public final sg2 E;
    public byte F;
    public gy2 G;
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
    public final mh6 a;
    public boolean a0;
    public final mh6 b;
    public CancellationTokenSource b0;
    public final TextView c;
    public id c0;
    public final wmb d;
    public id d0;
    public final lu7 e;
    public boolean e0;
    public final lu7 f;
    public boolean f0;
    public x77 g0;
    public final TextView h;
    public final qh6 h0;
    public final p66 n;
    public final View r;
    public final ImageView s;
    public int w;
    public int x;
    public final sg2 y;

    public ph6(qh6 qh6Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        this.h0 = qh6Var;
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
        bs2.t(textView, 1, 18.0f);
        if (qh6Var.G == 2) {
            i = 2131752519;
        } else {
            i = 2131742437;
        }
        textView.setText(ob6.M0(i, null));
        textView.setGravity(17);
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new uv5(this, context, (byte) 10));
        p66 p66Var = new p66(context, null);
        this.n = p66Var;
        if (qh6Var.G == 2) {
            i2 = 2131752520;
        } else {
            i2 = 2131744564;
        }
        p66Var.setText(ob6.M0(i2, null));
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(17);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(p66Var, tre.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new qk3(context, (byte) 1));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772019);
        loadAnimation.setInterpolator(dt3.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setImageResource(2131232194);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, tre.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, tre.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        lu7 lu7Var = new lu7(context, null);
        this.e = lu7Var;
        lu7Var.setText(ob6.M0(2131751719, null));
        lu7Var.addView(linearLayout, tre.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        lu7Var.setForceUseCenter(true);
        lu7Var.setFocusable(true);
        lu7Var.setContentDescription(ob6.M0(2131751719, null));
        lu7Var.setOnFocusChangeListener(new ts0(this, (byte) 13));
        addView(lu7Var, tre.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        lu7Var.setOnClickListener(new View.OnClickListener(this) {
            public final ph6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                d31 d31Var;
                String str;
                int i5;
                int i6;
                byte b = r2;
                ph6 ph6Var = this.b;
                switch (b) {
                    case 0:
                        qh6 qh6Var2 = ph6Var.h0;
                        if (qh6Var2.getParentActivity() != null) {
                            boolean z = !qh6Var2.E;
                            qh6Var2.E = z;
                            ((sg2) view).c(z, true);
                            boolean z2 = qh6Var2.E;
                            d26 d26Var = qh6Var2.a0;
                            if (z2) {
                                d31Var = new d31(d26Var, null);
                                str = "SyncContactsOn";
                                i5 = 2131743943;
                                i6 = 2131623992;
                            } else {
                                d31Var = new d31(d26Var, null);
                                str = "SyncContactsOff";
                                i5 = 2131743944;
                                i6 = 2131623991;
                            }
                            bs2.v(str, i5, d31Var, i6, 36);
                            return;
                        }
                        return;
                    case 1:
                        qh6 qh6Var3 = ph6Var.h0;
                        if (qh6Var3.getParentActivity() != null) {
                            boolean z3 = !qh6Var3.F;
                            qh6Var3.F = z3;
                            ((sg2) view).c(z3, true);
                            if (qh6Var3.getConnectionsManager().isTestBackend() != qh6Var3.F) {
                                qh6Var3.getConnectionsManager().switchBackend(false);
                            }
                            ph6Var.r();
                            return;
                        }
                        return;
                    default:
                        ky2 ky2Var = new ky2(ph6Var.H, true);
                        ky2Var.r = new kh6(ph6Var);
                        ph6Var.h0.presentFragment(ky2Var);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        lu7 lu7Var2 = new lu7(context, null);
        this.f = lu7Var2;
        lu7Var2.addView(linearLayout2, tre.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        lu7Var2.setText(ob6.M0(2131747017, null));
        addView(lu7Var2, tre.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, tre.o(-2, -2));
        mh6 mh6Var = new mh6(this, context, (byte) 0);
        this.a = mh6Var;
        mh6Var.setInputType(3);
        mh6Var.setCursorSize(hl.L(20.0f));
        mh6Var.setCursorWidth(1.5f);
        mh6Var.setPadding(hl.L(10.0f), 0, 0, 0);
        mh6Var.setTextSize(1, 16.0f);
        mh6Var.setMaxLines(1);
        mh6Var.setGravity(19);
        mh6Var.setImeOptions(268435461);
        mh6Var.setBackground(null);
        mh6Var.setShowSoftInputOnFocus(hl.A1());
        mh6Var.setContentDescription(ob6.M0(2131748494, null));
        linearLayout2.addView(mh6Var, tre.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        mh6Var.addTextChangedListener(new nh6(this, (byte) 0));
        mh6Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ph6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                byte b = r2;
                ph6 ph6Var = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 5) {
                            return false;
                        }
                        eh6 eh6Var = ph6Var.h0.c0;
                        if (eh6Var != null) {
                            eh6Var.h.callOnClick();
                        } else {
                            ph6Var.h(null);
                        }
                        return true;
                    default:
                        mh6 mh6Var2 = ph6Var.b;
                        if (i5 != 5) {
                            return false;
                        }
                        mh6Var2.requestFocus();
                        mh6Var2.setSelection(mh6Var2.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.r = view;
        LinearLayout.LayoutParams k = tre.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k.width = Math.max(2, hl.L(0.5f));
        linearLayout2.addView(view, k);
        mh6 mh6Var2 = new mh6(this, context, (byte) 1);
        this.b = mh6Var2;
        mh6Var2.setInputType(3);
        mh6Var2.setPadding(0, 0, 0, 0);
        mh6Var2.setCursorSize(hl.L(20.0f));
        mh6Var2.setCursorWidth(1.5f);
        mh6Var2.setTextSize(1, 16.0f);
        mh6Var2.setMaxLines(1);
        mh6Var2.setGravity(19);
        mh6Var2.setImeOptions(268435461);
        mh6Var2.setBackground(null);
        mh6Var2.setShowSoftInputOnFocus(hl.A1());
        mh6Var2.setContentDescription(ob6.M0(2131747017, null));
        linearLayout2.addView(mh6Var2, tre.c(36.0f, -1));
        mh6Var2.addTextChangedListener(new ak2(this, (byte) 1));
        mh6Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ph6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                byte b = r2;
                ph6 ph6Var = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 5) {
                            return false;
                        }
                        eh6 eh6Var = ph6Var.h0.c0;
                        if (eh6Var != null) {
                            eh6Var.h.callOnClick();
                        } else {
                            ph6Var.h(null);
                        }
                        return true;
                    default:
                        mh6 mh6Var22 = ph6Var.b;
                        if (i5 != 5) {
                            return false;
                        }
                        mh6Var22.requestFocus();
                        mh6Var22.setSelection(mh6Var22.length());
                        return true;
                }
            }
        });
        int i5 = 56;
        if (qh6Var.y && qh6Var.G == 0) {
            sg2 sg2Var = new sg2(context, 2);
            this.y = sg2Var;
            sg2Var.e(ob6.M0(2131743951, "SyncContacts"), "", qh6Var.E, false, false);
            if (ob6.a0 && hl.M1()) {
                i4 = 56;
            } else {
                i4 = 0;
            }
            addView(sg2Var, tre.t(-2, -1, 51, 16, 0, 16 + i4, 0));
            sg2Var.setOnClickListener(new View.OnClickListener(this) {
                public final ph6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    d31 d31Var;
                    String str;
                    int i52;
                    int i6;
                    byte b = r2;
                    ph6 ph6Var = this.b;
                    switch (b) {
                        case 0:
                            qh6 qh6Var2 = ph6Var.h0;
                            if (qh6Var2.getParentActivity() != null) {
                                boolean z = !qh6Var2.E;
                                qh6Var2.E = z;
                                ((sg2) view2).c(z, true);
                                boolean z2 = qh6Var2.E;
                                d26 d26Var = qh6Var2.a0;
                                if (z2) {
                                    d31Var = new d31(d26Var, null);
                                    str = "SyncContactsOn";
                                    i52 = 2131743943;
                                    i6 = 2131623992;
                                } else {
                                    d31Var = new d31(d26Var, null);
                                    str = "SyncContactsOff";
                                    i52 = 2131743944;
                                    i6 = 2131623991;
                                }
                                bs2.v(str, i52, d31Var, i6, 36);
                                return;
                            }
                            return;
                        case 1:
                            qh6 qh6Var3 = ph6Var.h0;
                            if (qh6Var3.getParentActivity() != null) {
                                boolean z3 = !qh6Var3.F;
                                qh6Var3.F = z3;
                                ((sg2) view2).c(z3, true);
                                if (qh6Var3.getConnectionsManager().isTestBackend() != qh6Var3.F) {
                                    qh6Var3.getConnectionsManager().switchBackend(false);
                                }
                                ph6Var.r();
                                return;
                            }
                            return;
                        default:
                            ky2 ky2Var = new ky2(ph6Var.H, true);
                            ky2Var.r = new kh6(ph6Var);
                            ph6Var.h0.presentFragment(ky2Var);
                            return;
                    }
                }
            });
            i3 = 48;
        } else {
            i3 = 72;
        }
        boolean z = f11.a;
        if (qh6Var.G == 0) {
            sg2 sg2Var2 = new sg2(context, 2);
            this.E = sg2Var2;
            String M0 = ob6.M0(2131751571, null);
            boolean isTestBackend = qh6Var.getConnectionsManager().isTestBackend();
            qh6Var.F = isTestBackend;
            sg2Var2.e(M0, "", isTestBackend, false, false);
            addView(sg2Var2, tre.t(-2, -1, 51, 16, 0, 16 + ((ob6.a0 && hl.M1()) ? i5 : 0), 0));
            i3 -= 24;
            sg2Var2.setOnClickListener(new View.OnClickListener(this) {
                public final ph6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    d31 d31Var;
                    String str;
                    int i52;
                    int i6;
                    byte b = r2;
                    ph6 ph6Var = this.b;
                    switch (b) {
                        case 0:
                            qh6 qh6Var2 = ph6Var.h0;
                            if (qh6Var2.getParentActivity() != null) {
                                boolean z2 = !qh6Var2.E;
                                qh6Var2.E = z2;
                                ((sg2) view2).c(z2, true);
                                boolean z22 = qh6Var2.E;
                                d26 d26Var = qh6Var2.a0;
                                if (z22) {
                                    d31Var = new d31(d26Var, null);
                                    str = "SyncContactsOn";
                                    i52 = 2131743943;
                                    i6 = 2131623992;
                                } else {
                                    d31Var = new d31(d26Var, null);
                                    str = "SyncContactsOff";
                                    i52 = 2131743944;
                                    i6 = 2131623991;
                                }
                                bs2.v(str, i52, d31Var, i6, 36);
                                return;
                            }
                            return;
                        case 1:
                            qh6 qh6Var3 = ph6Var.h0;
                            if (qh6Var3.getParentActivity() != null) {
                                boolean z3 = !qh6Var3.F;
                                qh6Var3.F = z3;
                                ((sg2) view2).c(z3, true);
                                if (qh6Var3.getConnectionsManager().isTestBackend() != qh6Var3.F) {
                                    qh6Var3.getConnectionsManager().switchBackend(false);
                                }
                                ph6Var.r();
                                return;
                            }
                            return;
                        default:
                            ky2 ky2Var = new ky2(ph6Var.H, true);
                            ky2Var.r = new kh6(ph6Var);
                            ph6Var.h0.presentFragment(ky2Var);
                            return;
                    }
                }
            });
        }
        if (i3 > 0 && !hl.M1()) {
            View space = new Space(context);
            space.setMinimumHeight(hl.L(i3));
            addView(space, tre.o(-2, -2));
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
                    String i0 = ob6.i0(2131750481, obj.d);
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
            cc4.g(e, true);
        }
        Collections.sort(this.H, Comparator$CC.comparing(new yz((byte) 10)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        ConnectionsManager.getInstance(qh6Var.getAccountInstance().a).sendRequest(new TLRPC.TL_help_getNearestDc(), new mw3(this, hashMap, (byte) 22), 10);
        if (this.a.length() == 0) {
            setCountryButtonText(null);
            this.b.setHintText((String) null);
            this.F = (byte) 1;
        }
        if (this.a.length() != 0) {
            this.b.requestFocus();
            mh6 mh6Var3 = this.b;
            mh6Var3.setSelection(mh6Var3.length());
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
        loadAnimation.setInterpolator(dt3.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        wmb wmbVar = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z = true;
        } else {
            z = false;
        }
        wmbVar.a(charSequence, z, false);
        lu7 lu7Var = this.e;
        if (charSequence != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        lu7Var.b(f, f, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.N = false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        if (i == jn7.l4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i5 = jn7.J2;
        if (i == i5) {
            qh6 qh6Var = this.h0;
            i3 = ((e) qh6Var).currentAccount;
            if (i2 == i3 && this.W) {
                this.W = false;
                i4 = ((e) qh6Var).currentAccount;
                jn7.f(i4).n(this, i5);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override
    public final void e() {
        int i;
        x77 x77Var = this.g0;
        if (x77Var != null) {
            x77Var.run();
            this.g0 = null;
        }
        this.a0 = true;
        if (this.W) {
            this.W = false;
            i = ((e) this.h0).currentAccount;
            jn7.f(i).n(this, jn7.J2);
        }
        CancellationTokenSource cancellationTokenSource = this.b0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.b0 = null;
        }
        id idVar = this.c0;
        if (idVar != null) {
            idVar.dismiss();
            this.c0 = null;
        }
        id idVar2 = this.d0;
        if (idVar2 != null) {
            idVar2.dismiss();
            this.d0 = null;
        }
    }

    @Override
    public String getHeaderName() {
        return ob6.M0(2131742427, "YourPhone");
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
            boolean z9 = f11.a;
            cc4.b("sim status = " + ((TelephonyManager) a.b.getSystemService("phone")).getSimState());
            if (this.a.length() != 0 && this.b.length() != 0) {
                String str2 = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
                if (!this.O) {
                    Point point = hl.q;
                    if (point.x > point.y && !this.h0.s1() && this.h0.T.Q() > hl.L(20.0f)) {
                        qh6 qh6Var = this.h0;
                        qh6Var.U = new fh6(this, (byte) 1);
                        hl.t1(qh6Var.fragmentView);
                        return;
                    }
                    qh6 qh6Var2 = this.h0;
                    Context context = this.h0.fragmentView.getContext();
                    qh6 qh6Var3 = this.h0;
                    qh6Var2.c0 = new eh6(context, (ViewGroup) qh6Var3.fragmentView, qh6Var3.O, str2, new v34(this, (byte) 12));
                    eh6 eh6Var = this.h0.c0;
                    eh6Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new dh6(eh6Var, (byte) 0));
                    duration.addUpdateListener(new ah6(eh6Var, (byte) 1));
                    duration.setInterpolator(k43.f);
                    duration.start();
                    return;
                }
                this.O = false;
                eh6 eh6Var2 = this.h0.c0;
                if (eh6Var2 != null) {
                    int i3 = eh6.G;
                    eh6Var2.a();
                }
                boolean L1 = hl.L1();
                if (L1) {
                    if (this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.h0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 28 && this.h0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (i4 >= 26 && this.h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    qh6 qh6Var4 = this.h0;
                    z = L1;
                    if (qh6Var4.w) {
                        qh6Var4.r.clear();
                        if (!z3) {
                            this.h0.r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z4) {
                            this.h0.r.add("android.permission.CALL_PHONE");
                        }
                        if (!z5) {
                            this.h0.r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z8 && i4 >= 26) {
                            this.h0.r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.h0.r.isEmpty()) {
                            SharedPreferences e1 = uc7.e1();
                            if (!e1.getBoolean("firstlogin", true) && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.h0.getParentActivity().requestPermissions((String[]) this.h0.r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                            }
                            e1.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.h0.getParentActivity());
                            alertDialog$Builder.j(ob6.M0(2131751736, "Continue"), null);
                            int i5 = 2131623958;
                            if (!z3 && (!z4 || !z5)) {
                                alertDialog$Builder.a.U = ob6.M0(2131754267, "AllowReadCallAndLog");
                            } else if (z4 && z5) {
                                alertDialog$Builder.a.U = ob6.M0(2131754268, "AllowReadCall");
                                i5 = 2131624067;
                            } else {
                                alertDialog$Builder.a.U = ob6.M0(2131754266, "AllowReadCallLog");
                            }
                            int i6 = aob.L5;
                            alertDialog$Builder.l(i5, 46, aob.w0(null, i6, false), null);
                            alertDialog$Builder.m(i6, null);
                            qh6 qh6Var5 = this.h0;
                            qh6Var5.h = qh6Var5.showDialog(alertDialog$Builder.a);
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
                    this.h0.z1(ob6.M0(2131745798, null), ob6.M0(2131752099, "ChooseCountry"));
                    this.h0.y1(false, z2);
                    return;
                }
                String str3 = "";
                String h = f78.h("" + ((Object) this.a.getText()) + ((Object) this.b.getText()), false);
                qh6 qh6Var6 = this.h0;
                if (qh6Var6.G == 0 && (qh6Var6.getParentActivity() instanceof LaunchActivity)) {
                    for (int i7 = 0; i7 < 4; i7++) {
                        yac h2 = yac.h(i7);
                        if (h2.o() && PhoneNumberUtils.compare(h, h2.f().phone)) {
                            boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
                            qh6 qh6Var7 = this.h0;
                            if (isTestBackend == qh6Var7.F) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qh6Var7.getParentActivity());
                                alertDialog$Builder2.a.S = ob6.M0(2131689472, null);
                                alertDialog$Builder2.a.U = ob6.M0(2131754704, "AccountAlreadyLoggedIn");
                                alertDialog$Builder2.j(ob6.M0(2131754689, "AccountSwitch"), new wg(this, i7, (byte) 13));
                                alertDialog$Builder2.g(ob6.M0(2131747558, "OK"), null);
                                this.h0.showDialog(alertDialog$Builder2.a);
                                this.h0.y1(false, true);
                                return;
                            }
                        }
                    }
                }
                ArrayList arrayList = null;
                TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
                if (z && z3 && z4 && z5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                tL_codeSettings.allow_flashcall = z6;
                if (z && z3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                tL_codeSettings.allow_missed_call = z7;
                boolean hasServices = b.b.hasServices();
                tL_codeSettings.allow_firebase = hasServices;
                tL_codeSettings.allow_app_hash = hasServices;
                if (this.h0.m0 || TextUtils.isEmpty(f11.f)) {
                    tL_codeSettings.allow_firebase = false;
                }
                ArrayList b = r40.b();
                if (b != null) {
                    for (int i8 = 0; i8 < b.size(); i8++) {
                        if (((TLRPC.TL_auth_authorization) b.get(i8)).future_auth_token != null) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            boolean z10 = f11.a;
                            cc4.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b.get(i8)).future_auth_token, StandardCharsets.UTF_8)));
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
                            tL_codeSettings.current_number = Collection.EL.stream(r1).anyMatch(new lz5(h, (byte) 1));
                        } else {
                            tL_codeSettings.unknown_number = true;
                            if (yac.c() > 0) {
                                tL_codeSettings.allow_flashcall = false;
                            } else {
                                tL_codeSettings.current_number = false;
                            }
                        }
                    } catch (Exception e2) {
                        tL_codeSettings.unknown_number = true;
                        cc4.g(e2, true);
                    }
                }
                qh6 qh6Var8 = this.h0;
                if (qh6Var8.G != 2) {
                    i = ((e) qh6Var8).currentAccount;
                    ConnectionsManager.getInstance(i).cleanup(false);
                    TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                    tL_auth_sendCode2.api_hash = f11.e;
                    tL_auth_sendCode2.api_id = f11.d;
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
                    bundle.putString("ephone", "+" + f78.h(this.a.getText().toString(), false) + " " + f78.h(this.b.getText().toString(), false));
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    bundle.putString("ephone", "+" + h);
                }
                bundle.putString("phoneFormated", h);
                gy2 gy2Var = this.G;
                if (gy2Var != null) {
                    bundle.putString("country", gy2Var.c);
                }
                this.N = true;
                pm3 pm3Var = new pm3((byte) 14, false);
                pm3Var.c = "+" + ((Object) this.a.getText()) + " " + ((Object) this.b.getText());
                pm3Var.b = this.G;
                pm3Var.d = (List) this.J.get(this.a.getText().toString());
                i2 = ((e) this.h0).currentAccount;
                this.h0.B1(ConnectionsManager.getInstance(i2).sendRequest(tL_auth_sendCode3, new in0(this, bundle, h, pm3Var, tL_auth_sendCode3, (byte) 8), 27), true);
                return;
            }
            qh6.E1(this.f, false);
        }
    }

    @Override
    public final void j() {
        p();
        sg2 sg2Var = this.y;
        if (sg2Var != null) {
            sg2Var.c(this.h0.E, false);
        }
        hl.d3(new fh6(this, (byte) 0), qh6.A0);
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
        qh6 qh6Var = this.h0;
        Activity parentActivity = qh6Var.getParentActivity();
        if (!this.a0 && !this.N && qh6Var.a == 0 && parentActivity != null && !parentActivity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.a.setText(((gy2) this.H.get(i)).c);
        this.L = false;
    }

    public final void p() {
        boolean z;
        boolean z2;
        boolean z3;
        gy2 gy2Var;
        if (!this.U && this.h0.G == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                if (hl.L1()) {
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
                    qh6 qh6Var = this.h0;
                    if (qh6Var.x && (!z || !z2)) {
                        qh6Var.s.clear();
                        if (!z) {
                            this.h0.s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z2 && i >= 26) {
                            this.h0.s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.h0.s.isEmpty()) {
                            new z56(this, new ArrayList(this.h0.s), (byte) 23).run();
                            return;
                        }
                        return;
                    }
                    this.U = true;
                    if (!qh6Var.y && z && z2) {
                        this.a.setAlpha(0.0f);
                        this.b.setAlpha(0.0f);
                        String h = f78.h(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(h)) {
                            int i2 = 4;
                            String str = null;
                            if (h.length() > 4) {
                                while (true) {
                                    if (i2 >= 1) {
                                        String substring = h.substring(0, i2);
                                        List list = (List) this.I.get(substring);
                                        if (list == null) {
                                            gy2Var = null;
                                        } else if (list.size() > 1) {
                                            String string = uc7.e1().getString("phone_code_last_matched_" + substring, null);
                                            gy2Var = (gy2) list.get(list.size() - 1);
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
                                                    gy2 gy2Var2 = (gy2) obj;
                                                    if (Objects.equals(gy2Var2.d, string)) {
                                                        gy2Var = gy2Var2;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            gy2Var = (gy2) list.get(0);
                                        }
                                        if (gy2Var != null) {
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
                                mh6 mh6Var = this.b;
                                mh6Var.setSelection(mh6Var.length());
                            }
                        }
                        if (this.b.length() > 0) {
                            AnimatorSet duration = new AnimatorSet().setDuration(300L);
                            mh6 mh6Var2 = this.a;
                            Property property = View.ALPHA;
                            duration.playTogether(ObjectAnimator.ofFloat(mh6Var2, property, 1.0f), ObjectAnimator.ofFloat(this.b, property, 1.0f));
                            duration.start();
                            this.O = true;
                            return;
                        }
                        this.a.setAlpha(1.0f);
                        this.b.setAlpha(1.0f);
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void q() {
        String str;
        int i;
        String str2 = this.S;
        mh6 mh6Var = this.b;
        if (mh6Var.getText() == null) {
            str = "";
        } else {
            str = mh6Var.getText().toString().replace(" ", "");
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
                int selectionStart = mh6Var.getSelectionStart();
                int selectionEnd = mh6Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                mh6Var.setHintText(str3);
                mh6Var.setSelection(Math.max(0, Math.min(mh6Var.length(), selectionStart)), Math.max(0, Math.min(mh6Var.length(), selectionEnd)));
                this.T = i;
            }
        } else if (this.T != -1) {
            int selectionStart2 = mh6Var.getSelectionStart();
            int selectionEnd2 = mh6Var.getSelectionEnd();
            mh6Var.setHintText((String) null);
            mh6Var.setSelection(selectionStart2, selectionEnd2);
            this.T = -1;
        }
    }

    public final void r() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (ob6.D0().B != null) {
            country = ob6.D0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.h0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new jh6(this, (byte) 0), 10);
    }

    public final void s() {
        int i;
        int i2;
        int i3;
        qh6 qh6Var = this.h0;
        if (qh6Var.G == 0 && !this.V && !this.a0) {
            i = ((e) qh6Var).currentAccount;
            uc7 s1 = uc7.s1(i);
            if (!s1.C3) {
                if (!this.W) {
                    this.W = true;
                    i2 = ((e) qh6Var).currentAccount;
                    jn7.f(i2).a(this, jn7.J2);
                    i3 = ((e) qh6Var).currentAccount;
                    ConnectionsManager.getInstance(i3).updateDcSettings();
                    return;
                }
                return;
            }
            this.V = true;
            boolean z = f11.j;
            if (z && s1.D3) {
                zj3 zj3Var = new zj3(this, (byte) 25);
                if (!z) {
                    zj3Var.a(Collections.EMPTY_LIST);
                    return;
                }
                zi4 zi4Var = dj4.a;
                if (zi4Var == null) {
                    Object b = ji4.c().b(zi4.class);
                    b.getClass();
                    zi4Var = (zi4) b;
                    dj4.a = zi4Var;
                }
                y4d.b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
                f5d f5dVar = new f5d(tl2.b(0, 1));
                t3d t3dVar = ((y4d) zi4Var).a;
                mh0 mh0Var = t3d.l;
                Log.i(mh0Var.b, mh0Var.b("Requesting verification support info.", new Object[0]));
                wjb b2 = xjb.b();
                b2.c = new a94[]{kid.a};
                b2.a = new ftb(f5dVar, (byte) 28);
                b2.d = (char) 37303;
                Task e = t3dVar.e(0, b2.a());
                e.getClass();
                Task continueWithTask = e.continueWithTask(new Object());
                continueWithTask.getClass();
                continueWithTask.addOnSuccessListener(new ic((byte) 0), new aj4(zj3Var)).addOnFailureListener(new ic((byte) 0), new aj4(zj3Var));
                return;
            }
            t(false);
        }
    }

    public final void t(final boolean z) {
        boolean z2;
        final int i;
        x77 x77Var;
        qh6 qh6Var = this.h0;
        if (qh6Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z2 = f11.i) && !this.f0) {
            if (z || !this.e0) {
                this.f0 = true;
                this.e0 = true;
                final Context context = getContext();
                i = ((e) qh6Var).currentAccount;
                final ih6 ih6Var = new ih6(this, (byte) 0);
                if (!z2) {
                    x77Var = null;
                } else {
                    context.getClass();
                    final vj0 vj0Var = new vj0(context, (byte) 1);
                    final boolean[] zArr = new boolean[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = f11.d;
                    initpasskeylogin.api_hash = f11.e;
                    final Runnable[] runnableArr = {new zs2(i, ConnectionsManager.getInstance(i).sendRequestTyped(initpasskeylogin, new ic((byte) 0), new icc() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            qz7.b(zArr, ih6Var, z, vj0Var, context, i, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), (byte) 6)};
                    x77Var = new x77(zArr, runnableArr, (byte) 2);
                }
                this.g0 = x77Var;
            }
        }
    }

    public final void u(String str, gy2 gy2Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = ob6.E0(gy2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new fy2((byte) 4), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) gy2Var.a);
        setCountryButtonText(pv3.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        q();
    }

    @Override
    public final void updateColors() {
        this.c.setTextColor(aob.w0(null, aob.G6, false));
        int w0 = aob.w0(null, aob.D6, false);
        p66 p66Var = this.n;
        p66Var.setTextColor(w0);
        p66Var.setLinkTextColor(aob.w0(null, aob.Xc, false));
        int i = 0;
        while (true) {
            wmb wmbVar = this.d;
            if (i >= wmbVar.getChildCount()) {
                break;
            }
            TextView textView = (TextView) wmbVar.getChildAt(i);
            textView.setTextColor(aob.w0(null, aob.G6, false));
            textView.setHintTextColor(aob.w0(null, aob.H6, false));
            i++;
        }
        int i2 = aob.H6;
        int w02 = aob.w0(null, i2, false);
        int i3 = this.w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.s;
        qh6.m1(imageView, w02, i3, mode);
        this.w = w02;
        int themedColor = this.h0.getThemedColor(aob.i6);
        qh6.n1(imageView, themedColor, this.x);
        this.x = themedColor;
        int i4 = aob.G6;
        this.h.setTextColor(aob.w0(null, i4, false));
        int w03 = aob.w0(null, i4, false);
        mh6 mh6Var = this.a;
        mh6Var.setTextColor(w03);
        int i5 = aob.l6;
        mh6Var.setCursorColor(aob.w0(null, i5, false));
        this.r.setBackgroundColor(aob.w0(null, aob.k6, false));
        int w04 = aob.w0(null, i4, false);
        mh6 mh6Var2 = this.b;
        mh6Var2.setTextColor(w04);
        mh6Var2.setHintTextColor(aob.w0(null, i2, false));
        mh6Var2.setCursorColor(aob.w0(null, i5, false));
        sg2 sg2Var = this.y;
        if (sg2Var != null) {
            int i6 = aob.Y6;
            int i7 = aob.W6;
            int i8 = aob.X6;
            CheckBoxSquare checkBoxSquare = sg2Var.n;
            if (checkBoxSquare != null) {
                checkBoxSquare.s = i6;
                checkBoxSquare.w = i7;
                checkBoxSquare.x = i8;
                checkBoxSquare.invalidate();
            }
            sg2Var.g();
        }
        sg2 sg2Var2 = this.E;
        if (sg2Var2 != null) {
            int i9 = aob.Y6;
            int i10 = aob.W6;
            int i11 = aob.X6;
            CheckBoxSquare checkBoxSquare2 = sg2Var2.n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.s = i9;
                checkBoxSquare2.w = i10;
                checkBoxSquare2.x = i11;
                checkBoxSquare2.invalidate();
            }
            sg2Var2.g();
        }
        this.f.f();
        this.e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
