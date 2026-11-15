package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class s1 implements RequestDelegate {
    public final int f26399a;
    public final Object f26400b;

    public s1(Object obj, int i7) {
        this.f26399a = i7;
        this.f26400b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        switch (this.f26399a) {
            case 0:
                g0.h3(new b4(16, (v1) this.f26400b, tLObject));
                return;
            case 1:
                g0.h3(new b4(2, (z5) this.f26400b, tLObject));
                return;
            case 2:
                i7 i7Var = (i7) this.f26400b;
                if (tL_error != null) {
                    i7Var.j(0, false);
                    return;
                } else if (tLObject instanceof Vector) {
                    i7Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f24334q0 == null) {
                            i7Var.f24334q0 = new HashMap();
                        }
                        for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i7);
                            i7Var.f24334q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i10 = 0; i10 < i7Var.I0.size(); i10++) {
                        h7 h7Var = (h7) i7Var.I0.get(i10);
                        if (i7Var.M != null || i7Var.f24295a0 == h7Var.f24066e) {
                            i7Var.I0.remove(i10);
                            if (!i7Var.m(h7Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = h7Var.f24067f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.f24068g;
                                if (tL_upload_webFile != null) {
                                    tL_upload_webFile.disableFree = false;
                                    tL_upload_webFile.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_cdnFile tL_upload_cdnFile = h7Var.h;
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
                    i7Var.getClass();
                    return;
                }
            case 3:
                g0.h3(new a((Runnable) this.f26400b, 24));
                return;
            case 4:
                ap apVar = (ap) this.f26400b;
                if (apVar != null) {
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
                    apVar.a(z10, tL_chatAdminRights, str);
                    return;
                }
                return;
            case 5:
                g0.h3(new fi(27, (gp) this.f26400b, tLObject));
                return;
            case 6:
                hp hpVar = (hp) this.f26400b;
                ArrayList arrayList = new ArrayList();
                if (tLObject instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject).documents;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Document document = arrayList2.get(i11);
                        i11++;
                        arrayList.add(hpVar.d(document));
                    }
                }
                g0.h3(new kg(hpVar, tLObject, arrayList, 15));
                return;
            case 7:
                h00 h00Var = (h00) this.f26400b;
                if (tLObject != null) {
                    h00Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    h00Var.getClass();
                    return;
                }
            default:
                m10 m10Var = (m10) this.f26400b;
                m10Var.getClass();
                g0.h3(new pq(24, m10Var, tLObject));
                return;
        }
    }
}
