package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class ds extends e implements fn7 {
    public d79 a;
    public cs b;
    public boolean c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f;
    public final ArrayList h;

    public ds() {
        super(null);
        this.c = false;
        this.e = -3;
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Y(boolean z) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new bs(0, 0, ob6.N0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new bs(1, 1, ob6.N0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new bs(2, 2, ob6.N0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().T0().size() > 1) {
            arrayList2.add(new bs(0, 3, ob6.N0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new bs(1, 4, ob6.N0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new bs(2, 5, ob6.N0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new bs(0, 6, ob6.N0("NewChatsFromNonContacts")));
        arrayList2.add(new bs(1, 7, ob6.N0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new bs(2, 8, ob6.N0("ArchiveAndMuteInfo")));
        cs csVar = this.b;
        if (csVar == null) {
            return;
        }
        if (z) {
            csVar.E(arrayList, arrayList2);
        } else {
            csVar.f();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131754136, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.s1();
        this.a.setLayoutManager(new as((byte) 0, 1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        d79 d79Var2 = this.a;
        cs csVar = new cs(this);
        this.b = csVar;
        d79Var2.setAdapter(csVar);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.a.setItemAnimator(zb3Var);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        this.a.setOnItemClickListener(new u(this, (byte) 3));
        getContactsController().B();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        Y(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.a != null) {
                for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
                    View childAt = this.a.getChildAt(i3);
                    this.a.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= 0) {
                        ArrayList arrayList = this.h;
                        if (S < arrayList.size()) {
                            byte b = ((bs) arrayList.get(S)).d;
                            if (b == 1) {
                                ((wkb) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (b == 4) {
                                ((wkb) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (b == 7) {
                                ((wkb) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.c = false;
        } else if (i == jn7.O2) {
            Y(true);
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.k0);
        super.onFragmentDestroy();
        if (this.c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new xe2((byte) 0));
            this.c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
