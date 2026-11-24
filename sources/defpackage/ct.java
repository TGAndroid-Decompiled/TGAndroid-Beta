package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class ct extends d implements jm7 {
    public r59 a;
    public bt b;
    public boolean c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f;
    public final ArrayList h;

    public ct() {
        super(null);
        this.c = false;
        this.e = -3;
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Z(boolean z) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new at(0, 0, jb6.N0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new at(1, 1, jb6.N0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new at(2, 2, jb6.N0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().S0().size() > 1) {
            arrayList2.add(new at(0, 3, jb6.N0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new at(1, 4, jb6.N0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new at(2, 5, jb6.N0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new at(0, 6, jb6.N0("NewChatsFromNonContacts")));
        arrayList2.add(new at(1, 7, jb6.N0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new at(2, 8, jb6.N0("ArchiveAndMuteInfo")));
        bt btVar = this.b;
        if (btVar == null) {
            return;
        }
        if (z) {
            btVar.E(arrayList, arrayList2);
        } else {
            btVar.f();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131754108, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.r1();
        this.a.setLayoutManager(new zs((byte) 0, 1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        r59 r59Var2 = this.a;
        bt btVar = new bt(this);
        this.b = btVar;
        r59Var2.setAdapter(btVar);
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.a.setItemAnimator(sc3Var);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        this.a.setOnItemClickListener(new u(this, (byte) 4));
        getContactsController().B();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        Z(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.a != null) {
                for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
                    View childAt = this.a.getChildAt(i3);
                    this.a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            byte b = ((at) arrayList.get(R)).d;
                            if (b == 1) {
                                ((bjb) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (b == 4) {
                                ((bjb) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (b == 7) {
                                ((bjb) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.c = false;
        } else if (i == nm7.O2) {
            Z(true);
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.k0);
        super.onFragmentDestroy();
        if (this.c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new nf2((byte) 0));
            this.c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
