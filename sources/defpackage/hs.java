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
public final class hs extends d implements gk7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final byte I;
    public boolean J;
    public final vf6 a;
    public gs b;
    public g24 c;
    public t26 d;
    public o39 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ee2 w;
    public int x;
    public int y;

    public hs(int i) {
        super(null);
        this.a = new vf6();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.I = i;
    }

    public final void a0() {
        long j;
        boolean z;
        if (!this.J && !this.r) {
            this.J = true;
            g24 g24Var = this.c;
            if (g24Var != null && !this.n) {
                g24Var.b();
            }
            gs gsVar = this.b;
            if (gsVar != null) {
                gsVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j = 0;
            } else {
                j = ((TLRPC.StickerSetCovered) b00.f(1, arrayList)).set.id;
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
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new tf(this, (byte) 1)), this.classGuid);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.Ii));
        hashSet.add(Integer.valueOf(bkb.Hi));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void b0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
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
            g24 g24Var = this.c;
            if (g24Var != null) {
                g24Var.c();
            }
            c0();
            gs gsVar = this.b;
            if (gsVar != null) {
                gsVar.f();
                return;
            }
            return;
        }
        this.w = new ee2(this, tL_messages_archivedStickers, (byte) 24);
    }

    public final void c0() {
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
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        byte b = this.I;
        if (b == 0) {
            phaVar.setTitle(k96.M0(2131754125, null));
        } else if (b == 5) {
            phaVar.setTitle(k96.M0(2131754131, null));
        } else {
            phaVar.setTitle(k96.M0(2131754130, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 2));
        this.b = new gs(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.c = g24Var;
        if (b == 0) {
            g24Var.setText(k96.M0(2131754122, null));
        } else {
            g24Var.setText(k96.M0(2131754127, null));
        }
        boolean z = this.J;
        g24 g24Var2 = this.c;
        if (z) {
            g24Var2.b();
        } else {
            g24Var2.c();
        }
        o39 o39Var = new o39(context, null);
        this.e = o39Var;
        o39Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        o39 o39Var2 = this.e;
        t26 t26Var = new t26(1, false);
        this.d = t26Var;
        o39Var2.setLayoutManager(t26Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, nme.c(-1.0f, -1));
        frameLayout.addView(this.c, nme.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        this.e.setOnItemClickListener(new u(this, (byte) 4));
        this.e.setOnScrollListener(new y(this, (byte) 2));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        o39 o39Var;
        es esVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i == kk7.X0) {
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
                c0();
                gs gsVar = this.b;
                if (gsVar != null) {
                    gsVar.p(this.y, arrayList2.size());
                }
            }
        } else if (i == kk7.w0 && (o39Var = this.e) != null) {
            int childCount = o39Var.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.e.getChildAt(i4);
                if ((childAt instanceof es) && (stickersSet = (esVar = (es) childAt).getStickersSet()) != null) {
                    boolean D0 = hq6.d0(this.currentAccount).D0(stickersSet.set.id, true);
                    if (D0) {
                        this.a.l(stickersSet.set.id);
                        ls8 ls8Var = esVar.f;
                        if (ls8Var != null) {
                            ls8Var.a(false, true);
                        }
                    }
                    esVar.a(D0, true, false);
                }
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        g24 g24Var = this.c;
        int i = bkb.g6;
        arrayList.add(new blb(g24Var, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.e, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.e, 196608, new Class[]{es.class}, new String[]{"addButton"}, (Drawable[]) null, (alb) null, bkb.Gi));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        a0();
        c0();
        kk7.f(this.currentAccount).b(this, kk7.X0);
        kk7.f(this.currentAccount).b(this, kk7.w0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.X0);
        kk7.f(this.currentAccount).n(this, kk7.w0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            g24 g24Var = this.c;
            if (g24Var != null) {
                g24Var.setProgressBarColor(bkb.w0(null, bkb.g6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.s = false;
        ee2 ee2Var = this.w;
        if (ee2Var != null) {
            ee2Var.run();
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
