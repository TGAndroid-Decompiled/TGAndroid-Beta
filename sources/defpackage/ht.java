package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ht extends d implements jm7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final byte I;
    public boolean J;
    public final vh6 a;
    public gt b;
    public r34 c;
    public u46 d;
    public r59 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public pf2 w;
    public int x;
    public int y;

    public ht(int i) {
        super(null);
        this.a = new vh6();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.I = i;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.Ii));
        hashSet.add(Integer.valueOf(cmb.Hi));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void b0() {
        long j;
        boolean z;
        if (!this.J && !this.r) {
            this.J = true;
            r34 r34Var = this.c;
            if (r34Var != null && !this.n) {
                r34Var.b();
            }
            gt gtVar = this.b;
            if (gtVar != null) {
                gtVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j = 0;
            } else {
                j = ((TLRPC.StickerSetCovered) b10.f(1, arrayList)).set.id;
            }
            tL_messages_getArchivedStickers.offset_id = j;
            tL_messages_getArchivedStickers.limit = 15;
            boolean z2 = false;
            byte b = this.I;
            if (b == 1) {
                z = true;
            } else {
                z = false;
            }
            tL_messages_getArchivedStickers.masks = z;
            if (b == 5) {
                z2 = true;
            }
            tL_messages_getArchivedStickers.emojis = z2;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new tg(this, (byte) 1)), this.classGuid);
        }
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z;
        if (!this.s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i2);
                i2++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.id);
                HashSet hashSet = this.f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
                    this.h.add(stickerSetCovered2);
                    i++;
                }
            }
            if (i <= 0) {
                z = true;
            } else {
                z = false;
            }
            this.r = z;
            this.J = false;
            this.n = true;
            r34 r34Var = this.c;
            if (r34Var != null) {
                r34Var.c();
            }
            d0();
            gt gtVar = this.b;
            if (gtVar != null) {
                gtVar.f();
                return;
            }
            return;
        }
        this.w = new pf2(this, tL_messages_archivedStickers, (byte) 25);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        byte b = this.I;
        if (b == 0) {
            rjaVar.setTitle(jb6.M0(2131754093, null));
        } else if (b == 5) {
            rjaVar.setTitle(jb6.M0(2131754099, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131754098, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 2));
        this.b = new gt(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.c = r34Var;
        if (b == 0) {
            r34Var.setText(jb6.M0(2131754090, null));
        } else {
            r34Var.setText(jb6.M0(2131754095, null));
        }
        boolean z = this.J;
        r34 r34Var2 = this.c;
        if (z) {
            r34Var2.b();
        } else {
            r34Var2.c();
        }
        r59 r59Var = new r59(context, null);
        this.e = r59Var;
        r59Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        r59 r59Var2 = this.e;
        u46 u46Var = new u46(1, false);
        this.d = u46Var;
        r59Var2.setLayoutManager(u46Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, qoe.c(-1.0f, -1));
        frameLayout.addView(this.c, qoe.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        this.e.setOnItemClickListener(new u(this, (byte) 5));
        this.e.setOnScrollListener(new y(this, (byte) 3));
        return this.fragmentView;
    }

    public final void d0() {
        int i;
        this.H = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            byte b = this.I;
            if (b != 0 && b != 5) {
                i = -1;
            } else {
                i = this.H;
                this.H = i + 1;
            }
            this.x = i;
            int i2 = this.H;
            this.y = i2;
            this.E = arrayList.size() + i2;
            int size = arrayList.size() + this.H;
            this.H = size;
            if (!this.r) {
                this.H = size + 1;
                this.F = size;
                this.G = -1;
                return;
            }
            this.H = size + 1;
            this.G = size;
            this.F = -1;
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r59 r59Var;
        et etVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i == nm7.Y0) {
            ArrayList arrayList2 = new ArrayList((List) objArr[0]);
            int size = arrayList2.size() - 1;
            while (true) {
                arrayList = this.h;
                if (size < 0) {
                    break;
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i3)).set.id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.id) {
                        arrayList2.remove(size);
                        break;
                    } else {
                        i3++;
                    }
                }
                size--;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(0, arrayList2);
                d0();
                gt gtVar = this.b;
                if (gtVar != null) {
                    gtVar.p(this.y, arrayList2.size());
                }
            }
        } else if (i == nm7.x0 && (r59Var = this.e) != null) {
            int childCount = r59Var.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.e.getChildAt(i4);
                if ((childAt instanceof et) && (stickersSet = (etVar = (et) childAt).getStickersSet()) != null) {
                    boolean D0 = hs6.d0(this.currentAccount).D0(stickersSet.set.id, true);
                    if (D0) {
                        this.a.l(stickersSet.set.id);
                        mu8 mu8Var = etVar.f;
                        if (mu8Var != null) {
                            mu8Var.a(false, true);
                        }
                    }
                    etVar.a(D0, true, false);
                }
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        r34 r34Var = this.c;
        int i = cmb.g6;
        arrayList.add(new cnb(r34Var, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.e, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.e, 196608, new Class[]{et.class}, new String[]{"addButton"}, (Drawable[]) null, (bnb) null, cmb.Gi));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        b0();
        d0();
        nm7.f(this.currentAccount).b(this, nm7.Y0);
        nm7.f(this.currentAccount).b(this, nm7.x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.Y0);
        nm7.f(this.currentAccount).n(this, nm7.x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gt gtVar = this.b;
        if (gtVar != null) {
            gtVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            r34 r34Var = this.c;
            if (r34Var != null) {
                r34Var.setProgressBarColor(cmb.w0(null, cmb.g6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.s = false;
        pf2 pf2Var = this.w;
        if (pf2Var != null) {
            pf2Var.run();
            this.w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        this.s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
