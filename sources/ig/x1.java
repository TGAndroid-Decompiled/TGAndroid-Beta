package ig;

import ai.bb;
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
import ci.e6;
import ci.z2;
import com.google.android.gms.internal.play_billing.k3;
import ei.bc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
import w7.z5;
public final class x1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public c71 f13083a;
    public final ArrayList f13084b;
    public NumberTextView f13085c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f13086f;

    public x1() {
        super(null);
        this.f13084b = new ArrayList();
        this.f13086f = true;
    }

    public static void U(x1 x1Var, int i10, ArrayList arrayList) {
        if (i10 == x1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((h61) arrayList.get(i11)).G instanceof z1) {
                    ((z1) ((h61) arrayList.get(i11)).G).f13100c = i11;
                }
            }
            a2 f7 = a2.f(x1Var.currentAccount);
            ArrayList arrayList2 = f7.f12826b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((z1) arrayList2.get(i12)).f13098a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((z1) arrayList2.get(i13)).f13098a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((z1) arrayList2.get(i14)).f13098a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f12825a).sendRequest(tL_messages_reorderQuickReplies, new e6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(x1 x1Var, ArrayList arrayList, u61 u61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        h61 h61Var = new h61(2);
        h61Var.f26785l = string;
        h61Var.f26788o = string2;
        h61Var.f26786m = "RestrictedEmoji";
        h61Var.f26787n = "📝";
        arrayList.add(h61Var);
        u61Var.U();
        a2 f7 = a2.f(x1Var.currentAccount);
        ArrayList arrayList2 = f7.f12826b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((z1) arrayList2.get(i13)).f13099b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((z1) arrayList2.get(i13)).f13099b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f12825a).quickRepliesLimit) {
            h61 c10 = h61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f26790q = true;
            arrayList.add(c10);
        }
        x1Var.e = u61Var.M();
        ArrayList arrayList3 = a2.f(x1Var.currentAccount).f12826b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            h61 h61Var2 = new h61(16);
            h61Var2.G = z1Var;
            h61Var2.K(x1Var.f13084b.contains(Integer.valueOf(z1Var.f13098a)));
            arrayList.add(h61Var2);
        }
        u61Var.L();
        u61Var.T();
        i2.e.B(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(x1 x1Var, h61 h61Var, View view) {
        if (h61Var.d == 1) {
            d0(x1Var.getParentActivity(), x1Var.currentAccount, null, null, x1Var.getResourceProvider(), new l0(x1Var, 2));
        } else if (h61Var.f44299a == 16 && (h61Var.G instanceof z1)) {
            if (!x1Var.f13084b.isEmpty()) {
                x1Var.e0(h61Var, view);
                return;
            }
            z1 z1Var = (z1) h61Var.G;
            if (!z1Var.f13102g) {
                Bundle i10 = org.telegram.ui.Cells.c1.i(5, "chatMode");
                i10.putLong("user_id", x1Var.getUserConfig().getClientUserId());
                i10.putString("quick_reply", z1Var.f13099b);
                qn qnVar = new qn(i10);
                qnVar.sb(z1Var.f13098a);
                x1Var.presentFragment(qnVar);
            }
        }
    }

    public static void X(x1 x1Var) {
        x1Var.f13084b.clear();
        AndroidUtilities.forEachViews((RecyclerView) x1Var.f13083a, (Utilities.Callback<View>) new ci.e(4));
        x1Var.actionBar.s();
        x1Var.f13083a.x1(false);
    }

    public static int c0(x1 x1Var) {
        return x1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, z1 z1Var, d6 d6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof lw0) && ((lw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (z1Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20608a;
        b2Var.R = string;
        final q1 q1Var = new q1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        q1Var.setTextSize(1, 18.0f);
        if (z1Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = z1Var.f13099b;
        }
        q1Var.setText(charSequence);
        int i13 = h6.f21099j5;
        q1Var.setTextColor(h6.w0(i13, d6Var));
        q1Var.setHintColor(h6.w0(h6.Xh, d6Var));
        q1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        q1Var.setSingleLine(true);
        q1Var.setFocusable(true);
        q1Var.setLineColors(h6.w0(h6.f21120k6, d6Var), h6.w0(h6.f21137l6, d6Var), h6.w0(h6.f21214p7, d6Var));
        q1Var.setImeOptions(6);
        q1Var.setBackgroundDrawable(null);
        q1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        q1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        ok.o(i13, d6Var, textView, 1, 16.0f);
        if (z1Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        ok.o(h6.f21231q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        z2 z2Var = new z2(r1, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new bc(z2Var, 23)};
        q1Var.addTextChangedListener(new s1(textView2, runnableArr));
        e.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(q1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e);
        b2Var.f20656a = AndroidUtilities.dp(292.0f);
        q1Var.setOnEditorActionListener(new t1(q1Var, i10, z1Var, textView2, z2Var, callback, b2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new m1(q1Var, z2Var, i10, z1Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fh.b(25));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new q(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            q1 q1Var2 = q1Var;
                            q1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var2);
                            return;
                        default:
                            q1 q1Var3 = q1Var;
                            q1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var3);
                            return;
                    }
                }
            });
            h.r(250L);
        } else {
            r32 = 0;
            b2Var.O = new l0(q1Var, 3);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new bb(q1Var, 6));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            q1 q1Var2 = q1Var;
                            q1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var2);
                            return;
                        default:
                            q1 q1Var3 = q1Var;
                            q1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(q1Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].f20669h0 = r32;
        q1Var.setSelection(q1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new o1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f13085c = numberTextView;
        numberTextView.setTextSize(18);
        this.f13085c.setTypeface(AndroidUtilities.bold());
        this.f13085c.setTextColor(h6.x0(null, h6.f21383y8, false));
        j10.addView(this.f13085c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f13085c.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        p1 p1Var = new p1(context, null, 0);
        p1Var.setBackgroundColor(h6.x0(null, h6.f20935a7, false));
        c71 c71Var = new c71(this, new Utilities.Callback2(this) {
            public final x1 f12950b;

            {
                this.f12950b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        x1.V(this.f12950b, (ArrayList) obj, (u61) obj2);
                        return;
                    default:
                        x1.U(this.f12950b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new l1(this), new l1(this));
        this.f13083a = c71Var;
        c71Var.p1();
        c71 c71Var2 = this.f13083a;
        c71Var2.W2.f30864r = false;
        c71Var2.C1(new Utilities.Callback2(this) {
            public final x1 f12950b;

            {
                this.f12950b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        x1.V(this.f12950b, (ArrayList) obj, (u61) obj2);
                        return;
                    default:
                        x1.U(this.f12950b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        p1Var.addView(this.f13083a, z5.c(-1.0f, -1));
        this.actionBar.A(this.f13083a, true);
        this.fragmentView = p1Var;
        return p1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        u61 u61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (c71Var = this.f13083a) != null && (u61Var = c71Var.W2) != null) {
            u61Var.N(true);
        }
    }

    public final void e0(h61 h61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        z1 z1Var = (z1) h61Var.G;
        w1 w1Var = (w1) view;
        Integer valueOf = Integer.valueOf(z1Var.f13098a);
        ArrayList arrayList = this.f13084b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(z1Var.f13098a));
        } else {
            arrayList.add(Integer.valueOf(z1Var.f13098a));
        }
        boolean z11 = true;
        this.f13083a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(z1Var.f13098a));
        h61Var.e = contains;
        w1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f13085c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z1 c10 = a2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 == null || a2.g(c10.f13099b)) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f13086f != z10) {
            this.f13086f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f13086f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f13086f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f13086f) {
                f11 = 0.7f;
            }
            ok.t(scaleX.scaleY(f11), bs.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        a2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f13083a.setPadding(0, 0, 0, i13);
        this.f13083a.setClipToPadding(false);
    }
}
