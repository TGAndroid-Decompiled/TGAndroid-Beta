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
import org.telegram.ui.ActionBar.e;
public final class is extends e implements fn7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final byte I;
    public boolean J;
    public final zh6 a;
    public hs b;
    public b34 c;
    public x46 d;
    public d79 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ve2 w;
    public int x;
    public int y;

    public is(int i) {
        super(null);
        this.a = new zh6();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.I = i;
    }

    public final void a0() {
        long j;
        boolean z;
        if (!this.J && !this.r) {
            this.J = true;
            b34 b34Var = this.c;
            if (b34Var != null && !this.n) {
                b34Var.b();
            }
            hs hsVar = this.b;
            if (hsVar != null) {
                hsVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j = 0;
            } else {
                j = ((TLRPC.StickerSetCovered) c00.g(1, arrayList)).set.id;
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
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new ye(this, (byte) 1)), this.classGuid);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.Ji));
        hashSet.add(Integer.valueOf(aob.Ii));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
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
            b34 b34Var = this.c;
            if (b34Var != null) {
                b34Var.c();
            }
            c0();
            hs hsVar = this.b;
            if (hsVar != null) {
                hsVar.f();
                return;
            }
            return;
        }
        this.w = new ve2(this, tL_messages_archivedStickers, (byte) 24);
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
        jla jlaVar = this.simpleActionBar;
        byte b = this.I;
        if (b == 0) {
            jlaVar.setTitle(ob6.M0(2131754121, null));
        } else if (b == 5) {
            jlaVar.setTitle(ob6.M0(2131754127, null));
        } else {
            jlaVar.setTitle(ob6.M0(2131754126, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 2));
        this.b = new hs(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.c = b34Var;
        if (b == 0) {
            b34Var.setText(ob6.M0(2131754118, null));
        } else {
            b34Var.setText(ob6.M0(2131754123, null));
        }
        boolean z = this.J;
        b34 b34Var2 = this.c;
        if (z) {
            b34Var2.b();
        } else {
            b34Var2.c();
        }
        d79 d79Var = new d79(context, null);
        this.e = d79Var;
        d79Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        d79 d79Var2 = this.e;
        x46 x46Var = new x46(1, false);
        this.d = x46Var;
        d79Var2.setLayoutManager(x46Var);
        this.e.s1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, tre.c(-1.0f, -1));
        frameLayout.addView(this.c, tre.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        this.e.setOnItemClickListener(new u(this, (byte) 4));
        this.e.setOnScrollListener(new y(this, (byte) 2));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        d79 d79Var;
        fs fsVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i == jn7.Y0) {
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
                hs hsVar = this.b;
                if (hsVar != null) {
                    hsVar.p(this.y, arrayList2.size());
                }
            }
        } else if (i == jn7.x0 && (d79Var = this.e) != null) {
            int childCount = d79Var.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.e.getChildAt(i4);
                if ((childAt instanceof fs) && (stickersSet = (fsVar = (fs) childAt).getStickersSet()) != null) {
                    boolean D0 = ls6.d0(this.currentAccount).D0(stickersSet.set.id, true);
                    if (D0) {
                        this.a.l(stickersSet.set.id);
                        uv8 uv8Var = fsVar.f;
                        if (uv8Var != null) {
                            uv8Var.a(false, true);
                        }
                    }
                    fsVar.a(D0, true, false);
                }
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        b34 b34Var = this.c;
        int i = aob.h6;
        arrayList.add(new apb(b34Var, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.e, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.e, 196608, new Class[]{fs.class}, new String[]{"addButton"}, (Drawable[]) null, (zob) null, aob.Hi));
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
        jn7.f(this.currentAccount).b(this, jn7.Y0);
        jn7.f(this.currentAccount).b(this, jn7.x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.Y0);
        jn7.f(this.currentAccount).n(this, jn7.x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            b34 b34Var = this.c;
            if (b34Var != null) {
                b34Var.setProgressBarColor(aob.w0(null, aob.h6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.s = false;
        ve2 ve2Var = this.w;
        if (ve2Var != null) {
            ve2Var.run();
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
