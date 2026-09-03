package d4;

import android.os.HandlerThread;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j3.y1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.uc0;
public final class b implements r8.i, h5.j, fl0, uc0, c2 {
    public final int f4198a;
    public final int f4199b;

    public b(int i10, int i11) {
        this.f4198a = i11;
        this.f4199b = i10;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f4198a;
        int i12 = this.f4199b;
        switch (i11) {
            case 4:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i12) {
                    return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
            default:
                if (i10 == i12) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public Object get() {
        switch (this.f4198a) {
            case 0:
                return new HandlerThread(c.j(this.f4199b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.f4199b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override
    public void invoke(Object obj) {
        ((y1) obj).onRepeatModeChanged(this.f4199b);
    }

    @Override
    public void j(d2 d2Var, int i10) {
        MessagesController.getInstance(this.f4199b).performLogout(1);
    }

    @Override
    public int run() {
        return this.f4199b;
    }
}
