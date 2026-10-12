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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import w7.a6;
public final class y1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 h;
    public h71 f11703a;
    public final ArrayList f11704b;
    public NumberTextView f11705c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f11706f;

    public y1() {
        super(null);
        this.f11704b = new ArrayList();
        this.f11706f = true;
    }

    public static void U(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((l61) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((l61) arrayList.get(i11)).G).f11436c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.f11448b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((a2) arrayList2.get(i12)).f11434a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(21));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).f11434a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((a2) arrayList2.get(i14)).f11434a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f11447a).sendRequest(tL_messages_reorderQuickReplies, new g7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(y1 y1Var, ArrayList arrayList, z61 z61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        l61 l61Var = new l61(2);
        l61Var.f26954l = string;
        l61Var.f26957o = string2;
        l61Var.f26955m = "RestrictedEmoji";
        l61Var.f26956n = "📝";
        arrayList.add(l61Var);
        z61Var.U();
        b2 f7 = b2.f(y1Var.currentAccount);
        ArrayList arrayList2 = f7.f11448b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11435b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11435b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f11447a).quickRepliesLimit) {
            l61 c10 = l61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f26959q = true;
            arrayList.add(c10);
        }
        y1Var.e = z61Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).f11448b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            l61 l61Var2 = new l61(16);
            l61Var2.G = a2Var;
            l61Var2.K(y1Var.f11704b.contains(Integer.valueOf(a2Var.f11434a)));
            arrayList.add(l61Var2);
        }
        z61Var.L();
        z61Var.T();
        i2.d.y(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, l61 l61Var, View view) {
        if (l61Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new bi.o1(y1Var, 26));
        } else if (l61Var.f43203a == 16 && (l61Var.G instanceof a2)) {
            if (!y1Var.f11704b.isEmpty()) {
                y1Var.e0(l61Var, view);
                return;
            }
            a2 a2Var = (a2) l61Var.G;
            if (!a2Var.f11438g) {
                Bundle g10 = org.telegram.ui.Cells.d0.g(5, "chatMode");
                g10.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                g10.putString("quick_reply", a2Var.f11435b);
                fo foVar = new fo(g10);
                foVar.rb(a2Var.f11434a);
                y1Var.presentFragment(foVar);
            }
        }
    }

    public static void X(y1 y1Var) {
        y1Var.f11704b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.f11703a, (Utilities.Callback<View>) new bi.f(4));
        y1Var.actionBar.s();
        y1Var.f11703a.x1(false);
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
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
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
            charSequence = a2Var.f11435b;
        }
        r1Var.setText(charSequence);
        int i13 = g6.f20007j5;
        r1Var.setTextColor(g6.w0(i13, c6Var));
        r1Var.setHintColor(g6.w0(g6.Xh, c6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(g6.w0(g6.f20028k6, c6Var), g6.w0(g6.f20045l6, c6Var), g6.w0(g6.f20122p7, c6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f7 = org.telegram.messenger.q.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        yh.n(i13, c6Var, textView, 1, 16.0f);
        if (a2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, a6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        yh.n(g6.f20139q7, c6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, a6.e(-1, -2, 83));
        u3 u3Var = new u3(r15, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new t0(u3Var, 3)};
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        f7.addView(frameLayout, a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(r1Var, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        a2Var2.f19557a = AndroidUtilities.dp(292.0f);
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
        a2VarArr[r32].f19570h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f11705c = numberTextView;
        numberTextView.setTextSize(18);
        this.f11705c.setTypeface(AndroidUtilities.bold());
        this.f11705c.setTextColor(g6.x0(null, g6.f20290y8, false));
        j10.addView(this.f11705c, a6.m(1.0f, 0, -1, 72, 0, 0));
        this.f11705c.setOnTouchListener(new ci.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        q1 q1Var = new q1(context, null, 0);
        q1Var.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        h71 h71Var = new h71(this, new Utilities.Callback2(this) {
            public final y1 f11569b;

            {
                this.f11569b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f11569b, (ArrayList) obj, (z61) obj2);
                        return;
                    default:
                        y1.U(this.f11569b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f11703a = h71Var;
        h71Var.p1();
        h71 h71Var2 = this.f11703a;
        h71Var2.W2.f31780r = false;
        h71Var2.C1(new Utilities.Callback2(this) {
            public final y1 f11569b;

            {
                this.f11569b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f11569b, (ArrayList) obj, (z61) obj2);
                        return;
                    default:
                        y1.U(this.f11569b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        q1Var.addView(this.f11703a, a6.d(-1.0f, -1));
        this.actionBar.A(this.f11703a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        z61 z61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (h71Var = this.f11703a) != null && (z61Var = h71Var.W2) != null) {
            z61Var.N(true);
        }
    }

    public final void e0(l61 l61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        a2 a2Var = (a2) l61Var.G;
        x1 x1Var = (x1) view;
        Integer valueOf = Integer.valueOf(a2Var.f11434a);
        ArrayList arrayList = this.f11704b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(a2Var.f11434a));
        } else {
            arrayList.add(Integer.valueOf(a2Var.f11434a));
        }
        boolean z11 = true;
        this.f11703a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(a2Var.f11434a));
        l61Var.e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f11705c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 == null || b2.g(c10.f11435b)) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f11706f != z10) {
            this.f11706f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f11706f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f11706f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f11706f) {
                f11 = 0.7f;
            }
            yh.s(scaleX.scaleY(f11), es.h, 340L);
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
        this.f11703a.setPadding(0, 0, 0, i13);
        this.f11703a.setClipToPadding(false);
    }
}
