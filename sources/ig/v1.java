package ig;

import ai.ab;
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
import com.google.android.gms.internal.cast.a6;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import w7.z5;
public final class v1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public a71 f13064a;
    public final ArrayList f13065b;
    public NumberTextView f13066c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f13067f;

    public v1() {
        super(null);
        this.f13065b = new ArrayList();
        this.f13067f = true;
    }

    public static void U(v1 v1Var, int i10, ArrayList arrayList) {
        if (i10 == v1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((f61) arrayList.get(i11)).G instanceof x1) {
                    ((x1) ((f61) arrayList.get(i11)).G).f13082c = i11;
                }
            }
            y1 f7 = y1.f(v1Var.currentAccount);
            ArrayList arrayList2 = f7.f13094b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = a6.f(((x1) arrayList2.get(i12)).f13080a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((x1) arrayList2.get(i13)).f13080a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = a6.f(((x1) arrayList2.get(i14)).f13080a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f13093a).sendRequest(tL_messages_reorderQuickReplies, new e6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(v1 v1Var, ArrayList arrayList, s61 s61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        f61 f61Var = new f61(2);
        f61Var.f26140l = string;
        f61Var.f26143o = string2;
        f61Var.f26141m = "RestrictedEmoji";
        f61Var.f26142n = "📝";
        arrayList.add(f61Var);
        s61Var.U();
        y1 f7 = y1.f(v1Var.currentAccount);
        ArrayList arrayList2 = f7.f13094b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((x1) arrayList2.get(i13)).f13081b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((x1) arrayList2.get(i13)).f13081b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f13093a).quickRepliesLimit) {
            f61 c10 = f61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f26145q = true;
            arrayList.add(c10);
        }
        v1Var.e = s61Var.M();
        ArrayList arrayList3 = y1.f(v1Var.currentAccount).f13094b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            f61 f61Var2 = new f61(16);
            f61Var2.G = x1Var;
            f61Var2.K(v1Var.f13065b.contains(Integer.valueOf(x1Var.f13080a)));
            arrayList.add(f61Var2);
        }
        s61Var.L();
        s61Var.T();
        i0.a.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(v1 v1Var, f61 f61Var, View view) {
        if (f61Var.d == 1) {
            d0(v1Var.getParentActivity(), v1Var.currentAccount, null, null, v1Var.getResourceProvider(), new l0(v1Var, 2));
        } else if (f61Var.f44314a == 16 && (f61Var.G instanceof x1)) {
            if (!v1Var.f13065b.isEmpty()) {
                v1Var.e0(f61Var, view);
                return;
            }
            x1 x1Var = (x1) f61Var.G;
            if (!x1Var.f13084g) {
                Bundle j10 = org.telegram.ui.Cells.t0.j(5, "chatMode");
                j10.putLong("user_id", v1Var.getUserConfig().getClientUserId());
                j10.putString("quick_reply", x1Var.f13081b);
                sn snVar = new sn(j10);
                snVar.rb(x1Var.f13080a);
                v1Var.presentFragment(snVar);
            }
        }
    }

    public static void X(v1 v1Var) {
        v1Var.f13065b.clear();
        AndroidUtilities.forEachViews((RecyclerView) v1Var.f13064a, (Utilities.Callback<View>) new ci.e(4));
        v1Var.actionBar.r();
        v1Var.f13064a.x1(false);
    }

    public static int c0(v1 v1Var) {
        return v1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, x1 x1Var, d6 d6Var, Utilities.Callback callback) {
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
        if (R != null && (R.getFragmentView() instanceof jw0) && ((jw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
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
        if (x1Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20601a;
        b2Var.R = string;
        final o1 o1Var = new o1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        o1Var.setTextSize(1, 18.0f);
        if (x1Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = x1Var.f13081b;
        }
        o1Var.setText(charSequence);
        int i13 = h6.f21092j5;
        o1Var.setTextColor(h6.w0(i13, d6Var));
        o1Var.setHintColor(h6.w0(h6.Xh, d6Var));
        o1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        o1Var.setSingleLine(true);
        o1Var.setFocusable(true);
        o1Var.setLineColors(h6.w0(h6.f21113k6, d6Var), h6.w0(h6.f21130l6, d6Var), h6.w0(h6.f21207p7, d6Var));
        o1Var.setImeOptions(6);
        o1Var.setBackgroundDrawable(null);
        o1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        o1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        wh.o(i13, d6Var, textView, 1, 16.0f);
        if (x1Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        wh.o(h6.f21224q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        z2 z2Var = new z2(r1, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new bc(z2Var, 23)};
        o1Var.addTextChangedListener(new q1(textView2, runnableArr));
        e.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(o1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e);
        b2Var.f20649a = AndroidUtilities.dp(292.0f);
        o1Var.setOnEditorActionListener(new r1(o1Var, i10, x1Var, textView2, z2Var, callback, b2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new k1(o1Var, z2Var, i10, x1Var, textView2, callback));
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
                            o1 o1Var2 = o1Var;
                            o1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var2);
                            return;
                        default:
                            o1 o1Var3 = o1Var;
                            o1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            b2Var.O = new l0(o1Var, 3);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new ab(o1Var, 6));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            o1 o1Var2 = o1Var;
                            o1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var2);
                            return;
                        default:
                            o1 o1Var3 = o1Var;
                            o1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(o1Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].f20662h0 = r32;
        o1Var.setSelection(o1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        i0.a.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new m1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f13066c = numberTextView;
        numberTextView.setTextSize(18);
        this.f13066c.setTypeface(AndroidUtilities.bold());
        this.f13066c.setTextColor(h6.x0(null, h6.f21376y8, false));
        j10.addView(this.f13066c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f13066c.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        n1 n1Var = new n1(context, null, 0);
        n1Var.setBackgroundColor(h6.x0(null, h6.f20928a7, false));
        a71 a71Var = new a71(this, new Utilities.Callback2(this) {
            public final v1 f12930b;

            {
                this.f12930b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        v1.V(this.f12930b, (ArrayList) obj, (s61) obj2);
                        return;
                    default:
                        v1.U(this.f12930b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new j1(this), new j1(this));
        this.f13064a = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.f13064a;
        a71Var2.W2.f30200r = false;
        a71Var2.C1(new Utilities.Callback2(this) {
            public final v1 f12930b;

            {
                this.f12930b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        v1.V(this.f12930b, (ArrayList) obj, (s61) obj2);
                        return;
                    default:
                        v1.U(this.f12930b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        n1Var.addView(this.f13064a, z5.d(-1.0f, -1));
        this.actionBar.A(this.f13064a, true);
        this.fragmentView = n1Var;
        return n1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        s61 s61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (a71Var = this.f13064a) != null && (s61Var = a71Var.W2) != null) {
            s61Var.N(true);
        }
    }

    public final void e0(f61 f61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        x1 x1Var = (x1) f61Var.G;
        u1 u1Var = (u1) view;
        Integer valueOf = Integer.valueOf(x1Var.f13080a);
        ArrayList arrayList = this.f13065b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(x1Var.f13080a));
        } else {
            arrayList.add(Integer.valueOf(x1Var.f13080a));
        }
        boolean z11 = true;
        this.f13064a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(x1Var.f13080a));
        f61Var.e = contains;
        u1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f13066c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            x1 c10 = y1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 == null || y1.g(c10.f13081b)) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f13067f != z10) {
            this.f13067f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f13067f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f13067f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f13067f) {
                f11 = 0.7f;
            }
            wh.t(scaleX.scaleY(f11), bs.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        y1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f13064a.setPadding(0, 0, 0, i13);
        this.f13064a.setClipToPadding(false);
    }
}
