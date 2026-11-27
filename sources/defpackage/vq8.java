package defpackage;

import org.telegram.ui.ProfileActivity;
public final class vq8 extends yc8 {
    public final ProfileActivity a;

    public vq8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override
    public final void F() {
        this.a.f0.getImageReceiver().v0(true, true);
    }

    @Override
    public final defpackage.fd8 M(defpackage.r47 r11, org.telegram.tgnet.TLRPC.FileLocation r12, int r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq8.M(r47, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):fd8");
    }

    @Override
    public final void g(String str, String str2, boolean z) {
        this.a.r0.p(str, str2, z);
    }
}
