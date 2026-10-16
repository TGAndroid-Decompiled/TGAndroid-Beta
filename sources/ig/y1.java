package ig;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.g7;
import bi.t4;
import bi.u3;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import w7.z5;
public final class y1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 h;
    public i71 f11707a;
    public final ArrayList f11708b;
    public NumberTextView f11709c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f11710f;

    public y1() {
        super(null);
        this.f11708b = new ArrayList();
        this.f11710f = true;
    }

    public static void U(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((m61) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((m61) arrayList.get(i11)).G).f11440c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.f11452b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((a2) arrayList2.get(i12)).f11438a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(21));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).f11438a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((a2) arrayList2.get(i14)).f11438a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f11451a).sendRequest(tL_messages_reorderQuickReplies, new g7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(y1 y1Var, ArrayList arrayList, a71 a71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        m61 m61Var = new m61(2);
        m61Var.f26946l = string;
        m61Var.f26949o = string2;
        m61Var.f26947m = "RestrictedEmoji";
        m61Var.f26948n = "📝";
        arrayList.add(m61Var);
        a71Var.U();
        b2 f7 = b2.f(y1Var.currentAccount);
        ArrayList arrayList2 = f7.f11452b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11439b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11439b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f11451a).quickRepliesLimit) {
            m61 c10 = m61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f26951q = true;
            arrayList.add(c10);
        }
        y1Var.e = a71Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).f11452b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            m61 m61Var2 = new m61(16);
            m61Var2.G = a2Var;
            m61Var2.K(y1Var.f11708b.contains(Integer.valueOf(a2Var.f11438a)));
            arrayList.add(m61Var2);
        }
        a71Var.L();
        a71Var.T();
        i2.d.B(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, m61 m61Var, View view) {
        if (m61Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new bi.o1(y1Var, 26));
        } else if (m61Var.f42904a == 16 && (m61Var.G instanceof a2)) {
            if (!y1Var.f11708b.isEmpty()) {
                y1Var.e0(m61Var, view);
                return;
            }
            a2 a2Var = (a2) m61Var.G;
            if (!a2Var.f11442g) {
                Bundle f7 = org.telegram.ui.Cells.c1.f(5, "chatMode");
                f7.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                f7.putString("quick_reply", a2Var.f11439b);
                fo foVar = new fo(f7);
                foVar.rb(a2Var.f11438a);
                y1Var.presentFragment(foVar);
            }
        }
    }

    public static void X(y1 y1Var) {
        y1Var.f11708b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.f11707a, (Utilities.Callback<View>) new bi.f(4));
        y1Var.actionBar.s();
        y1Var.f11707a.x1(false);
    }

    public static int c0(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, a2 a2Var, c6 c6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        m2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ow0) && ((ow0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (a2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
        a2Var2.R = string;
        final r1 r1Var = new r1(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        if (a2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = a2Var.f11439b;
        }
        r1Var.setText(charSequence);
        int i13 = g6.f19707j5;
        r1Var.setTextColor(g6.w0(i13, c6Var));
        r1Var.setHintColor(g6.w0(g6.Xh, c6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(g6.w0(g6.f19728k6, c6Var), g6.w0(g6.f19745l6, c6Var), g6.w0(g6.f19822p7, c6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        sk.o(i13, c6Var, textView, 1, 16.0f);
        if (a2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        sk.o(g6.f19839q7, c6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        u3 u3Var = new u3(r15, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new t0(u3Var, 3)};
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        e.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(r1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e);
        a2Var2.f19257a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, u3Var, callback, a2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new n1(r1Var, u3Var, i10, a2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fi.c2(23));
        if (z10) {
            h = a2Var2;
            a2VarArr[0] = a2Var2;
            a2Var2.setOnDismissListener(new q(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            return;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            a2Var2.O = new bi.o1(r1Var, 27);
            a2VarArr[0] = a2Var2;
            a2Var2.setOnDismissListener(new t4(r1Var, 3));
            a2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            return;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            return;
                    }
                }
            });
            a2VarArr[0].show();
        }
        a2VarArr[r32].f19270h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f11709c = numberTextView;
        numberTextView.setTextSize(18);
        this.f11709c.setTypeface(AndroidUtilities.bold());
        this.f11709c.setTextColor(g6.x0(null, g6.f19990y8, false));
        j10.addView(this.f11709c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f11709c.setOnTouchListener(new ci.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        q1 q1Var = new q1(context, null, 0);
        q1Var.setBackgroundColor(g6.x0(null, g6.f19543a7, false));
        i71 i71Var = new i71(this, new Utilities.Callback2(this) {
            public final y1 f11573b;

            {
                this.f11573b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f11573b, (ArrayList) obj, (a71) obj2);
                        return;
                    default:
                        y1.U(this.f11573b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f11707a = i71Var;
        i71Var.p1();
        i71 i71Var2 = this.f11707a;
        i71Var2.W2.f23145r = false;
        i71Var2.C1(new Utilities.Callback2(this) {
            public final y1 f11573b;

            {
                this.f11573b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f11573b, (ArrayList) obj, (a71) obj2);
                        return;
                    default:
                        y1.U(this.f11573b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        q1Var.addView(this.f11707a, z5.d(-1.0f, -1));
        this.actionBar.B(this.f11707a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i71 i71Var;
        a71 a71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (i71Var = this.f11707a) != null && (a71Var = i71Var.W2) != null) {
            a71Var.N(true);
        }
    }

    public final void e0(m61 m61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        a2 a2Var = (a2) m61Var.G;
        x1 x1Var = (x1) view;
        Integer valueOf = Integer.valueOf(a2Var.f11438a);
        ArrayList arrayList = this.f11708b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(a2Var.f11438a));
        } else {
            arrayList.add(Integer.valueOf(a2Var.f11438a));
        }
        boolean z11 = true;
        this.f11707a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(a2Var.f11438a));
        m61Var.e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f11709c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 == null || b2.g(c10.f11439b)) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f11710f != z10) {
            this.f11710f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f11710f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f11710f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f11710f) {
                f11 = 0.7f;
            }
            sk.t(scaleX.scaleY(f11), es.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        b2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f11707a.setPadding(0, 0, 0, i13);
        this.f11707a.setClipToPadding(false);
    }
}
