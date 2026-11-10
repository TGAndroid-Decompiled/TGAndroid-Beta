package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s6 {
    public int f9737a;
    public String f9738b;
    public TLRPC.Photo f9739c;
    public TLRPC.Document d;

    public static s6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f9737a = tL_storyAlbum.album_id;
        obj.f9738b = tL_storyAlbum.title;
        obj.f9739c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
