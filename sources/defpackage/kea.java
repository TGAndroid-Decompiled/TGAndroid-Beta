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
import org.telegram.ui.ActionBar.d;
public final class kea extends n39 {
    public final Context c;
    public t7a e;
    public int n;
    public final byte r;
    public int s;
    public final nfa w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public kea(nfa nfaVar, Context context, int i) {
        this.w = nfaVar;
        this.c = context;
        this.r = i;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (this.f.size() + this.d.size() != 0) {
            return true;
        }
        return false;
    }

    public final k27 E(int i) {
        if (i < this.d.size()) {
            return (k27) this.d.get(i);
        }
        return (k27) this.f.get(i - this.d.size());
    }

    public final void F(final int i, long j, long j2, final String str) {
        d dVar = this.w.y1;
        if (!cf3.B(j)) {
            if (this.h != 0) {
                dVar.getConnectionsManager().cancelRequest(this.h, true);
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
                tL_messages_search.peer = dVar.getMessagesController().h1(j);
                if (j2 != 0) {
                    int i2 = (j > dVar.getUserConfig().e() ? 1 : (j == dVar.getUserConfig().e() ? 0 : -1));
                    int i3 = tL_messages_search.flags;
                    if (i2 == 0) {
                        tL_messages_search.flags = i3 | 4;
                        tL_messages_search.saved_peer_id = dVar.getMessagesController().h1(j2);
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
                this.h = dVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList = new ArrayList();
                        kea keaVar = kea.this;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                                TLRPC.Message message = messages_messages.messages.get(i5);
                                int i6 = i;
                                if (i6 == 0 || message.id <= i6) {
                                    arrayList.add(new k27(keaVar.w.y1.getCurrentAccount(), message, false, true));
                                }
                            }
                        }
                        gl.c3(new ica(keaVar, i4, arrayList, str, (byte) 1));
                    }
                }, 2);
                dVar.getConnectionsManager().bindRequestToGuid(this.h, dVar.getClassGuid());
                return;
            }
            this.f.clear();
            this.n = 0;
            f();
        }
    }

    public final void G(String str, boolean z) {
        t7a t7aVar = this.e;
        if (t7aVar != null) {
            gl.r(t7aVar);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        nfa nfaVar = this.w;
        if (isEmpty) {
            if (!this.d.isEmpty() || !this.f.isEmpty() || this.s != 0) {
                this.d.clear();
                this.f.clear();
                if (this.h != 0) {
                    nfaVar.y1.getConnectionsManager().cancelRequest(this.h, true);
                    this.h = 0;
                    this.s--;
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            iea[] ieaVarArr = nfaVar.n0;
            if (i < ieaVarArr.length) {
                iea ieaVar = ieaVarArr[i];
                if (ieaVar.F == this.r) {
                    ieaVar.w.e(true, z);
                }
                i++;
            } else {
                t7a t7aVar2 = new t7a(this, str, (byte) 6);
                this.e = t7aVar2;
                gl.d3(t7aVar2, 300L);
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
    public final void t(s49 s49Var, int i) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        boolean z3;
        char c3;
        View view = s49Var.a;
        nfa nfaVar = this.w;
        long j = nfaVar.m1;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        boolean z4 = false;
        byte b = this.r;
        if (b == 1) {
            if (view instanceof iba) {
                iba ibaVar = (iba) view;
                k27 E = E(i);
                if (i != b() - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ibaVar.c(E, z3);
                if (nfaVar.F1) {
                    if (k27.B0(E.k) == j) {
                        c3 = 0;
                    } else {
                        c3 = 1;
                    }
                    if (sparseArrayArr[c3].indexOfKey(E.e1()) >= 0) {
                        z4 = true;
                    }
                    ibaVar.b(z4, !nfaVar.e1);
                    return;
                }
                ibaVar.b(false, !nfaVar.e1);
            }
        } else if (b == 3) {
            if (view instanceof lba) {
                lba lbaVar = (lba) view;
                k27 E2 = E(i);
                if (i != b() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lbaVar.E = z2;
                lbaVar.e();
                lbaVar.c0 = E2;
                lbaVar.requestLayout();
                if (nfaVar.F1) {
                    if (k27.B0(E2.k) == j) {
                        c2 = 0;
                    } else {
                        c2 = 1;
                    }
                    if (sparseArrayArr[c2].indexOfKey(E2.e1()) >= 0) {
                        z4 = true;
                    }
                    lbaVar.f(z4, !nfaVar.e1);
                    return;
                }
                lbaVar.f(false, !nfaVar.e1);
            }
        } else if (b == 4 && (view instanceof eba)) {
            eba ebaVar = (eba) view;
            k27 E3 = E(i);
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            ebaVar.f(E3, z);
            if (nfaVar.F1) {
                if (k27.B0(E3.k) == j) {
                    c = 0;
                } else {
                    c = 1;
                }
                if (sparseArrayArr[c].indexOfKey(E3.e1()) >= 0) {
                    z4 = true;
                }
                ebaVar.e(z4, !nfaVar.e1);
                return;
            }
            ebaVar.e(false, !nfaVar.e1);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout ue4Var;
        nfa nfaVar = this.w;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        byte b = this.r;
        if (b == 1) {
            ue4Var = new iba(0, wjbVar, context);
        } else if (b == 4) {
            ue4Var = new ue4(this, context, wjbVar, (byte) 1);
        } else {
            lba lbaVar = new lba(0, wjbVar, context);
            lbaVar.setDelegate(nfaVar.W1);
            ue4Var = lbaVar;
        }
        ue4Var.setLayoutParams(new e49(-1, -2));
        return new s49(ue4Var);
    }
}
