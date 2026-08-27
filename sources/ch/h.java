package ch;

import ag.e1;
import ag.n0;
import ag.w;
import ag.z2;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.c2;
import f2.l;
import h7.b6;
import h7.z5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import n2.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class h extends qa implements ud.b {

    public static final int f2915n0 = 0;
    public final ud.c T;
    public final ud.a U;
    public final HashMap V;
    public final ArrayList W;
    public final ArrayList X;
    public String Y;
    public b51 Z;

    public final lh.d f2916a0;

    public final e1 f2917b0;

    public final w f2918c0;

    public final t10 f2919d0;

    public final s3 f2920e0;

    public final HashMap f2921f0;

    public b0 f2922g0;

    public int f2923h0;

    public final int f2924i0;

    public final FrameLayout f2925j0;

    public HashSet f2926k0;

    public final Rect f2927l0;
    public a30 m0;

    public h(Context context, c6 c6Var) {
        super(context, null, true, true, false, false, false, 2, c6Var);
        er erVar = er.h;
        this.T = new ud.c(3, this, erVar, 350L);
        this.U = new ud.a(4, this, erVar, 320L, false);
        this.V = new HashMap();
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f2921f0 = new HashMap();
        this.f2927l0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.H = false;
        this.f31858w = false;
        this.f2924i0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new z2(this, 2));
        this.d.setOnItemClickListener(new d(context, this, c6Var));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.f2916a0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        e1 e1Var = new e1(this, context);
        this.f2917b0 = e1Var;
        e1Var.setTextColor(getThemedColor(g6.Sh));
        e1Var.setText(LocaleController.getString(R.string.Save));
        e1Var.setTypeface(AndroidUtilities.bold());
        e1Var.setTextSize(1, 14.0f);
        e1Var.setGravity(17);
        e1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        e1Var.setVisibility(8);
        b6.a(e1Var);
        this.f31853e.n().addView(e1Var, z5.t(-2, 48, 16, 12, 0, 12, 0));
        e1Var.setOnClickListener(new a(this, 1));
        p10 p10Var = new p10(context, c6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        gg.g gVar = p10Var.f31468r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new e(this, 0));
        t10 t10Var = new t10(context, this.currentAccount);
        this.f2919d0 = t10Var;
        t10Var.setDelegate(new b(this));
        w wVar = new w(context, this, c6Var);
        this.f2918c0 = wVar;
        int i11 = this.backgroundPaddingLeft;
        wVar.setPadding(i11, 0, i11, 0);
        wVar.addView(p10Var, z5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        wVar.addView(t10Var, z5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        s3 s3Var = new s3(context, 18, c6Var);
        this.f2920e0 = s3Var;
        s3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        s3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        wVar.addView(s3Var, z5.e(-1, 32, 48));
        this.containerView.addView(wVar, z5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, z5.c(48.0f, -1));
        this.containerView.addView(frameLayout, z5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f2925j0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, z5.e(-1, 150, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(erVar);
        lVar.C = false;
        lVar.f5819m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new f(this, c6Var));
        n0 n0Var = new n0(this, 4);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new cf.a(n0Var, 3));
        r0.b0.j(getContainer(), new b(this));
    }

    public static void P(h hVar, Pair pair) {
        HashMap map = hVar.f2921f0;
        HashMap map2 = hVar.V;
        map2.putAll((Map) pair.first);
        ArrayList arrayList = hVar.W;
        arrayList.addAll((Collection) pair.second);
        j$.util.Map.EL.forEach(map2, new c2(hVar, 1));
        HashSet<String> hashSet = hVar.f2926k0;
        if (hashSet != null) {
            for (String str : hashSet) {
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        tL_help_country = null;
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    for (TLRPC.TL_help_country tL_help_country : (List) map2.get((String) obj)) {
                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                            break;
                        }
                    }
                }
                if (tL_help_country != null) {
                    a30 a30Var = new a30(hVar.getContext(), tL_help_country);
                    a30Var.setOnClickListener(new a(hVar, 3));
                    hVar.f2919d0.a(a30Var);
                    map.put(tL_help_country.iso2, a30Var);
                }
            }
        }
        hVar.Z.N(true);
        hVar.f2916a0.c(map.size(), true);
    }

    public final void Q() {
        int iDp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.T.f48502e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f2927l0;
        boolean z10 = (rect.top == iDp && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, iDp, this.containerView.getMeasuredWidth(), measuredHeight);
        zk0 zk0Var = this.d;
        zk0Var.setClipBounds(rect);
        if (z10) {
            zk0Var.invalidate();
        }
    }

    public final void R() {
        zk0 zk0Var;
        float y10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < y10) {
                y10 = childAt.getY();
            }
            i10++;
        }
        float fMax = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, y10 + AndroidUtilities.dp(8.0f));
        w wVar = this.f2918c0;
        if (wVar.getTranslationY() != fMax) {
            wVar.setTranslationY(fMax);
            zk0Var.invalidate();
        }
    }

    public final void S(View view) {
        a30 a30Var = (a30) view;
        if (!a30Var.f26618y) {
            a30 a30Var2 = this.m0;
            if (a30Var2 != null) {
                a30Var2.a();
            }
            this.m0 = a30Var;
            a30Var.b();
            return;
        }
        this.m0 = null;
        this.f2919d0.c(a30Var);
        String countryIso2 = a30Var.getCountryIso2();
        HashMap map = this.f2921f0;
        map.remove(countryIso2);
        this.f2916a0.c(map.size(), true);
        this.Z.N(true);
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                m10.d(this.f2917b0, f10);
            }
        } else {
            Q();
            this.f2920e0.setTranslationY(AndroidUtilities.dp(48.0f) + f10);
            this.f2918c0.invalidate();
        }
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new c(this, 0), this.resourcesProvider);
        this.Z = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
