package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class cs extends d implements gk7 {
    public o39 a;
    public bs b;
    public boolean c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f;
    public final ArrayList h;

    public cs() {
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
        arrayList2.add(new as(0, 0, k96.N0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new as(1, 1, k96.N0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new as(2, 2, k96.N0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().R0().size() > 1) {
            arrayList2.add(new as(0, 3, k96.N0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new as(1, 4, k96.N0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new as(2, 5, k96.N0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new as(0, 6, k96.N0("NewChatsFromNonContacts")));
        arrayList2.add(new as(1, 7, k96.N0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new as(2, 8, k96.N0("ArchiveAndMuteInfo")));
        bs bsVar = this.b;
        if (bsVar == null) {
            return;
        }
        if (z) {
            bsVar.E(arrayList, arrayList2);
        } else {
            bsVar.f();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131754140, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.r1();
        this.a.setLayoutManager(new zr((byte) 0, 1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        o39 o39Var2 = this.a;
        bs bsVar = new bs(this);
        this.b = bsVar;
        o39Var2.setAdapter(bsVar);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.a.setItemAnimator(gb3Var);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
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
        if (i == kk7.j0) {
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
                            byte b = ((as) arrayList.get(R)).d;
                            if (b == 1) {
                                ((ahb) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (b == 4) {
                                ((ahb) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (b == 7) {
                                ((ahb) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.c = false;
        } else if (i == kk7.N2) {
            Y(true);
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.j0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.j0);
        super.onFragmentDestroy();
        if (this.c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ce2((byte) 0));
            this.c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
