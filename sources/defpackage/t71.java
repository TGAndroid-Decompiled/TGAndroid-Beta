package defpackage;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t71 extends j71 {
    public final w71 n;

    public t71(w71 w71Var) {
        super(w71Var, 3);
        this.n = w71Var;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        float f;
        n71 n71Var = (n71) f89Var.a;
        vea veaVar = (vea) n71Var.b.getChildAt(0);
        c71 c71Var = ((p71) this.e.get(i)).d;
        if (c71Var == n71Var.getTag()) {
            z = true;
        } else {
            z = false;
        }
        if (i != this.e.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        n71Var.setTag(c71Var);
        w71 w71Var = this.n;
        r47 r47Var = c71Var.f;
        if (r47Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e = yac.h(w71Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = c71Var.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = c71Var.b;
            String D = xb4.D(c71Var.a);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = c71Var.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (c71Var.e == null) {
                jp5 jp5Var = new jp5();
                c71Var.e = jp5Var;
                jp5Var.b = true;
                Utilities.e.c(new tu0(w71Var, c71Var, tL_documentAttributeAudio, (byte) 11));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = c71Var.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            r47 r47Var2 = new r47(w71Var.e.getCurrentAccount(), tL_message, false, false);
            c71Var.f = r47Var2;
            r47Var2.z0 = true;
            r47Var = r47Var2;
        }
        veaVar.f(r47Var, z2);
        boolean z3 = c71Var.e.b;
        boolean z4 = !z3;
        if (!z) {
            if (!z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            veaVar.h0 = f;
        }
        if (veaVar.g0 != z4) {
            veaVar.g0 = z4;
            veaVar.invalidate();
        }
        n71Var.d = z2;
        n71Var.c.setText(hl.i0(c71Var.c, false, false));
        n71Var.a.a(this.n.h.j.contains(c71Var), z);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        n71 n71Var = new n71(this, viewGroup.getContext(), (byte) 1);
        n71Var.e = (byte) 3;
        s71 s71Var = new s71(this, viewGroup.getContext(), n71Var);
        s71Var.setCheckForButtonPress(true);
        n71Var.b.addView(s71Var);
        return new f89(n71Var);
    }
}
