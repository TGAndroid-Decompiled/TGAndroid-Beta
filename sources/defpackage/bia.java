package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class bia extends c79 {
    public final Context c;
    public ida e;
    public int n;
    public final byte r;
    public int s;
    public final eja w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public bia(eja ejaVar, Context context, int i) {
        this.w = ejaVar;
        this.c = context;
        this.r = i;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (this.f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final r47 E(int i) {
        if (i < this.d.size()) {
            return (r47) this.d.get(i);
        }
        return (r47) this.f.get(i - this.d.size());
    }

    public final void F(final int i, long j, long j2, final String str) {
        e eVar = this.w.y1;
        if (!wf3.B(j)) {
            if (this.h != 0) {
                eVar.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
            }
            if (str != null && str.length() != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 50;
                tL_messages_search.offset_id = i;
                byte b = this.r;
                if (b == 1) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
                } else if (b == 3) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
                } else if (b == 4) {
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
                }
                tL_messages_search.q = str;
                tL_messages_search.peer = eVar.getMessagesController().j1(j);
                if (j2 != 0) {
                    int i2 = (j > eVar.getUserConfig().e() ? 1 : (j == eVar.getUserConfig().e() ? 0 : -1));
                    int i3 = tL_messages_search.flags;
                    if (i2 == 0) {
                        tL_messages_search.flags = i3 | 4;
                        tL_messages_search.saved_peer_id = eVar.getMessagesController().j1(j2);
                    } else {
                        tL_messages_search.flags = i3 | 2;
                        tL_messages_search.top_msg_id = (int) j2;
                    }
                }
                if (tL_messages_search.peer == null) {
                    return;
                }
                final int i4 = this.n + 1;
                this.n = i4;
                this.s++;
                this.h = eVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        bia biaVar = bia.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                                TLRPC.Message message = messages_messages.messages.get(i5);
                                int i6 = i;
                                if (i6 == 0 || message.id <= i6) {
                                    arrayList.add(new r47(biaVar.w.y1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        hl.c3(new efa(biaVar, i4, arrayList, str, (byte) 3));
                    }
                }, 2);
                eVar.getConnectionsManager().bindRequestToGuid(this.h, eVar.getClassGuid());
                return;
            }
            this.f.clear();
            this.n = 0;
            f();
        }
    }

    public final void G(String str, boolean z) {
        ida idaVar = this.e;
        if (idaVar != null) {
            hl.r(idaVar);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        eja ejaVar = this.w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f.isEmpty() || this.s != 0) {
                this.d.clear();
                this.f.clear();
                if (this.h != 0) {
                    ejaVar.y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            zha[] zhaVarArr = ejaVar.n0;
            if (i < zhaVarArr.length) {
                zha zhaVar = zhaVarArr[i];
                if (zhaVar.F == this.r) {
                    zhaVar.w.e(true, z);
                }
                i++;
            } else {
                ida idaVar2 = new ida(this, str, (byte) 5);
                this.e = idaVar2;
                hl.d3(idaVar2, 300L);
                return;
            }
        }
    }

    @Override
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        if (size2 != 0) {
            return size + size2;
        }
        return size;
    }

    @Override
    public final int d(int i) {
        return 24;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        boolean z3;
        char c3;
        View view = f89Var.a;
        eja ejaVar = this.w;
        long j = ejaVar.m1;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        boolean z4 = false;
        byte b = this.r;
        if (b == 1) {
            if (view instanceof zea) {
                zea zeaVar = (zea) view;
                r47 E = E(i);
                if (i != b() - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zeaVar.c(E, z3);
                if (ejaVar.F1) {
                    if (r47.B0(E.k) == j) {
                        c3 = 0;
                    } else {
                        c3 = 1;
                    }
                    if (sparseArrayArr[c3].indexOfKey(E.e1()) >= 0) {
                        z4 = true;
                    }
                    zeaVar.b(z4, !ejaVar.e1);
                    return;
                }
                zeaVar.b(false, !ejaVar.e1);
            }
        } else if (b == 3) {
            if (view instanceof cfa) {
                cfa cfaVar = (cfa) view;
                r47 E2 = E(i);
                if (i != b() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cfaVar.E = z2;
                cfaVar.e();
                cfaVar.c0 = E2;
                cfaVar.requestLayout();
                if (ejaVar.F1) {
                    if (r47.B0(E2.k) == j) {
                        c2 = 0;
                    } else {
                        c2 = 1;
                    }
                    if (sparseArrayArr[c2].indexOfKey(E2.e1()) >= 0) {
                        z4 = true;
                    }
                    cfaVar.f(z4, !ejaVar.e1);
                    return;
                }
                cfaVar.f(false, !ejaVar.e1);
            }
        } else if (b == 4 && (view instanceof vea)) {
            vea veaVar = (vea) view;
            r47 E3 = E(i);
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            veaVar.f(E3, z);
            if (ejaVar.F1) {
                if (r47.B0(E3.k) == j) {
                    c = 0;
                } else {
                    c = 1;
                }
                if (sparseArrayArr[c].indexOfKey(E3.e1()) >= 0) {
                    z4 = true;
                }
                veaVar.e(z4, !ejaVar.e1);
                return;
            }
            veaVar.e(false, !ejaVar.e1);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout sg4Var;
        eja ejaVar = this.w;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        byte b = this.r;
        if (b == 1) {
            sg4Var = new zea(0, vnbVar, context);
        } else if (b == 4) {
            sg4Var = new sg4(this, context, vnbVar, (byte) 1);
        } else {
            cfa cfaVar = new cfa(0, vnbVar, context);
            cfaVar.setDelegate(ejaVar.W1);
            sg4Var = cfaVar;
        }
        sg4Var.setLayoutParams(new r79(-1, -2));
        return new f89(sg4Var);
    }
}
