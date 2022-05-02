package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public class DownloadObject {
    public boolean forceCache;
    public long id;
    public TLObject object;
    public String parent;
    public boolean secret;
    public int type;
}
