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
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.tc0;
public final class b implements r8.i, h5.j, el0, tc0, c2 {
    public final int f4113a;
    public final int f4114b;

    public b(int i10, int i11) {
        this.f4113a = i11;
        this.f4114b = i10;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f4113a;
        int i12 = this.f4114b;
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
        switch (this.f4113a) {
            case 0:
                return new HandlerThread(c.j(this.f4114b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.f4114b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override
    public void invoke(Object obj) {
        ((y1) obj).onRepeatModeChanged(this.f4114b);
    }

    @Override
    public void l(d2 d2Var, int i10) {
        MessagesController.getInstance(this.f4114b).performLogout(1);
    }

    @Override
    public int run() {
        return this.f4114b;
    }
}
