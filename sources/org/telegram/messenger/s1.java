package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class s1 implements RequestDelegate {
    public final int f25266a;
    public final Object f25267b;

    public s1(Object obj, int i3) {
        this.f25266a = i3;
        this.f25267b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        switch (this.f25266a) {
            case 0:
                g0.h3(new b4(16, (v1) this.f25267b, tLObject));
                return;
            case 1:
                g0.h3(new b4(2, (z5) this.f25267b, tLObject));
                return;
            case 2:
                i7 i7Var = (i7) this.f25267b;
                if (tL_error != null) {
                    i7Var.j(0, false);
                    return;
                } else if (tLObject instanceof Vector) {
                    i7Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f23500q0 == null) {
                            i7Var.f23500q0 = new HashMap();
                        }
                        for (int i3 = 0; i3 < vector.objects.size(); i3++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i3);
                            i7Var.f23500q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i10 = 0; i10 < i7Var.I0.size(); i10++) {
                        h7 h7Var = (h7) i7Var.I0.get(i10);
                        if (i7Var.M != null || i7Var.f23461a0 == h7Var.f22893e) {
                            i7Var.I0.remove(i10);
                            if (!i7Var.m(h7Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = h7Var.f22894f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.f22895g;
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
                g0.h3(new a((Runnable) this.f25267b, 23));
                return;
            case 4:
                uo uoVar = (uo) this.f25267b;
                if (uoVar != null) {
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
                    uoVar.a(z10, tL_chatAdminRights, str);
                    return;
                }
                return;
            case 5:
                g0.h3(new yh(27, (ap) this.f25267b, tLObject));
                return;
            case 6:
                bp bpVar = (bp) this.f25267b;
                ArrayList arrayList = new ArrayList();
                if (tLObject instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject).documents;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Document document = arrayList2.get(i11);
                        i11++;
                        arrayList.add(bpVar.d(document));
                    }
                }
                g0.h3(new dg(bpVar, tLObject, arrayList, 15));
                return;
            case 7:
                c00 c00Var = (c00) this.f25267b;
                if (tLObject != null) {
                    c00Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    c00Var.getClass();
                    return;
                }
            default:
                h10 h10Var = (h10) this.f25267b;
                h10Var.getClass();
                g0.h3(new pq(23, h10Var, tLObject));
                return;
        }
    }
}
