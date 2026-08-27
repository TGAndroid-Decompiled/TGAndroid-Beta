package jh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class k6 {

    public int f13588a;

    public String f13589b;

    public TLRPC.Photo f13590c;
    public TLRPC.Document d;

    public static k6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        k6 k6Var = new k6();
        k6Var.f13588a = tL_storyAlbum.album_id;
        k6Var.f13589b = tL_storyAlbum.title;
        k6Var.f13590c = tL_storyAlbum.icon_photo;
        k6Var.d = tL_storyAlbum.icon_video;
        return k6Var;
    }
}
