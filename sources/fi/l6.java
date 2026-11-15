package fi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 {
    public int f11998a;
    public String f11999b;
    public TLRPC.Photo f12000c;
    public TLRPC.Document d;

    public static l6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f11998a = tL_storyAlbum.album_id;
        obj.f11999b = tL_storyAlbum.title;
        obj.f12000c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
