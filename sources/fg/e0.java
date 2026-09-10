package fg;

import org.telegram.messenger.R;
public enum e0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f8000a;
    public final int f8001b;
    public final int f8002c;

    e0(int i10, int i11, int i12) {
        this.f8000a = i10;
        this.f8001b = i11;
        this.f8002c = i12;
    }
}
