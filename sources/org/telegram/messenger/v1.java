package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v1 implements RequestDelegate {
    public final int f18574a;
    public final Object f18575b;

    public v1(Object obj, int i10) {
        this.f18574a = i10;
        this.f18575b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        switch (this.f18574a) {
            case 0:
                i0.g3(new e4(14, (y1) this.f18575b, tLObject));
                return;
            case 1:
                i0.g3(new e4(2, (b6) this.f18575b, tLObject));
                return;
            case 2:
                m7 m7Var = (m7) this.f18575b;
                if (tL_error != null) {
                    m7Var.j(0, false);
                    return;
                } else if (tLObject instanceof Vector) {
                    m7Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (m7Var.f17081q0 == null) {
                            m7Var.f17081q0 = new HashMap();
                        }
                        for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i10);
                            m7Var.f17081q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i11 = 0; i11 < m7Var.I0.size(); i11++) {
                        l7 l7Var = (l7) m7Var.I0.get(i11);
                        if (m7Var.M != null || m7Var.f17043a0 == l7Var.e) {
                            m7Var.I0.remove(i11);
                            if (!m7Var.m(l7Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = l7Var.f16905f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_webFile tL_upload_webFile = l7Var.f16906g;
                                if (tL_upload_webFile != null) {
                                    tL_upload_webFile.disableFree = false;
                                    tL_upload_webFile.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_cdnFile tL_upload_cdnFile = l7Var.h;
                                if (tL_upload_cdnFile != null) {
                                    tL_upload_cdnFile.disableFree = false;
                                    tL_upload_cdnFile.freeResources();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } else {
                    m7Var.getClass();
                    return;
                }
            case 3:
                i0.g3(new a((Runnable) this.f18575b, 25));
                return;
            case 4:
                jp jpVar = (jp) this.f18575b;
                if (jpVar != null) {
                    String str = null;
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    if (tL_error == null && channelParticipant != null && !channelParticipant.left) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (channelParticipant != null) {
                        tL_chatAdminRights = channelParticipant.admin_rights;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    if (channelParticipant != null) {
                        str = channelParticipant.rank;
                    }
                    jpVar.a(z10, tL_chatAdminRights, str);
                    return;
                }
                return;
            case 5:
                i0.g3(new pi(25, (pp) this.f18575b, tLObject));
                return;
            case 6:
                qp qpVar = (qp) this.f18575b;
                ArrayList arrayList = new ArrayList();
                if (tLObject instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject).documents;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Document document = arrayList2.get(i12);
                        i12++;
                        arrayList.add(qpVar.d(document));
                    }
                }
                i0.g3(new lg(qpVar, tLObject, arrayList, 15));
                return;
            case 7:
                y00 y00Var = (y00) this.f18575b;
                if (tLObject != null) {
                    y00Var.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    y00Var.getClass();
                    return;
                }
            default:
                e20 e20Var = (e20) this.f18575b;
                e20Var.getClass();
                i0.g3(new ir(21, e20Var, tLObject));
                return;
        }
    }
}
