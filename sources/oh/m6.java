package oh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 {
    public int f17439a;
    public String f17440b;
    public TLRPC.Photo f17441c;
    public TLRPC.Document d;

    public static m6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f17439a = tL_storyAlbum.album_id;
        obj.f17440b = tL_storyAlbum.title;
        obj.f17441c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
